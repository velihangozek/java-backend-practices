import enums.LogLevel;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class LogApp {

    private static Set<String> USER_NAMES = new HashSet<>();
    private static File LOG_FILE = new File("C:\\Users\\velih\\OneDrive\\Masaüstü\\Velo\\Patika Plus Patika Dev Java Backend Bootcamp\\Cohort Content\\Week-08\\LogApp\\src\\main\\resources\\log.txt");

    public static void main(String[] args) {

        USER_NAMES.add("Alex");
        USER_NAMES.add("Bob");
        USER_NAMES.add("Carl");
        USER_NAMES.add("Velo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your nickname: ");

        String userName = scanner.nextLine();

        Optional<String> optionalUserName = USER_NAMES.stream()
                .filter(name -> name.equalsIgnoreCase(userName))
                .findFirst();

        if (optionalUserName.isEmpty()) {
            writeLog(LogLevel.ERROR, "User not found!: " + userName);
            System.out.println("User not found!: " + userName);
        } else {
            writeLog(LogLevel.INFO, "User logged in!: " + optionalUserName.get());
            System.out.println("User logged in!: " + optionalUserName.get());
            printMenu(scanner);
        }

        scanner.close();

    }

    private static void printMenu(Scanner scanner) {
        int choice;

        do {

            System.out.println("\n --- LOG APP ---");
            System.out.println("1. Search in logs");
            System.out.println("2. Clear logs");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    searchLogs(scanner);
                    break;
                case 2:
                    clearLogs(scanner);
                    break;
                case 3:
                    writeLog(LogLevel.WARN, "App terminated!");
                    System.out.println("App terminating...");
                    break;
                default:
                    System.out.println("Invalid choice!: " + choice);
            }
        } while (choice != 3);
    }

    private static void clearLogs(Scanner scanner) {

        System.out.println("Are you sure you want to clear logs? (y/n)");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))) {

                writer.write(""); // Since append mode is false, it will overwrite the whole file.
                System.out.println("Logs cleared!");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {

            System.out.println("Log clearing cancelled!");

        }
    }

    private static void searchLogs(Scanner scanner) {

        System.out.println("Word searching for: ");
        String searchKey = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {

            String line;
            boolean isFound = false;

            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(searchKey.toLowerCase())) {
                    System.out.println("Found log => " + line);
                    isFound = true;
                }
            }

            if (!isFound) {
                System.out.println("No log found for " + searchKey);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void writeLog(LogLevel logLevel, String message) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {

            String formattedDate = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            String log = String.format("[%s] [%s] [%s]", formattedDate, logLevel, message);

            writer.write(log);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Log couldn't be written!: " + e.getMessage());
        }

    }

}