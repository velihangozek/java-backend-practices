import java.util.*;
import java.util.stream.Stream;

public class MemoryGame {

    private final Scanner scanner = new Scanner(System.in);
    private final Player player;
    private final List<Level> levelList;
    private final Set<Player> playerSet = new HashSet<>();

    public MemoryGame(Player player) {
        this.player = player;
        this.levelList = List.of(
                new Level("Easy", 3, 1500),
                new Level("Medium", 5, 1000),
                new Level("Hard", 7, 700)
        );
    }

    public void showMenu() {

        while (true) {

            System.out.println("Game Menu");
            System.out.println("1 - Start the game");
            System.out.println("2 - Leaderboard");
            System.out.println("3 - Exit");

            String choice = scanner.nextLine();
            switch (choice) {

                case "1":
                    playGame();
                    break;
                case "2":
                    // TODO Show top-10 players
                    showLeaderBoard();
                    break;
                case "3":
                    System.out.println("Thank you for playing " + this.player.getNickName() + "!");
                    return;
                default:
                    System.out.println("Invalid choice");

            }

        }

    }

    private void showLeaderBoard() {

        List<Player> topPlayers = this.playerSet.stream()
                .limit(3)
                .toList();

        System.out.println(topPlayers);

    }

    private void playGame() {

        System.out.println("Please choose a level: ");

        for (int i = 0; i < this.levelList.size(); i++) {

            System.out.println((i + 1) + ". " + this.levelList.get(i).getName());

        }

        System.out.println("Your choice: ");
        int levelIndex;

        levelIndex = Integer.parseInt(scanner.nextLine()) - 1;

        Level level = this.levelList.get(levelIndex);

        Random random = new Random();

        List<Integer> randomNumberList = new ArrayList<>();

        for (int i = 0; i < level.getNumberCount(); i++) {
            int randomNumber = random.nextInt(90) + 10;
            randomNumberList.add(randomNumber);
        }

        System.out.println("🧠 Random numbers will be displayed, so get ready!");

        try {
            sleep();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread showNumbersTask = new Thread(new NumberDisplayTask(randomNumberList, level.getDisplayTime()));
        showNumbersTask.start();

        try {
            showNumbersTask.join(); // Wait for displaying numbers task to end.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🤯 Which numbers were displayed? (Use space between the numbers you will type!) => ");
        System.out.println("Guess: ");
        String[] guessedNumbers = scanner.nextLine().split(" ");

        int correctGuessCounter = 0;

        for (String inputNumber : guessedNumbers) {

            int guess = Integer.parseInt(inputNumber);

            if (randomNumberList.contains(guess)) {

                correctGuessCounter++;
                randomNumberList.remove((Integer) guess);

            }
        }

        System.out.println("Your correct count of guesses: " + correctGuessCounter);
        this.player.addScore(correctGuessCounter * 10);
        this.playerSet.add(this.player);

        System.out.println("Your score is: " + this.player.getScore());

    }

    private void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

}