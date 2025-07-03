import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("🎮 Welcome to the Memory Game!");
        System.out.println("Enter the name of the player: ");
        String nickName = scanner.nextLine();

        MemoryGame memoryGame = new MemoryGame(new Player(nickName));
        memoryGame.showMenu();

    }

}