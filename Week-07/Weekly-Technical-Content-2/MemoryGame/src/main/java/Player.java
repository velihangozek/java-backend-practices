public class Player {

    private String nickName;
    private int score;

    public Player(String nickName) {
        this.nickName = nickName;
        this.score = 0;
    }

    public String getNickName() {
        return nickName;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", score=" + score +
                '}';
    }
}