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
}