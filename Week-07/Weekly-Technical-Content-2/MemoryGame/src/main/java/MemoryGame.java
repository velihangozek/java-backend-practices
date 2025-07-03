import java.util.*;

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
    }

    private void playGame() {
    }

}