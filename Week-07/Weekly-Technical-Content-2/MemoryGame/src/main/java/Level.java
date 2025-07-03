public class Level {

    private final String name;
    private final int numberCount;
    private final int displayTime;

    public Level(String name, int numberCount, int displayTime) {
        this.name = name;
        this.numberCount = numberCount;
        this.displayTime = displayTime;
    }

    public String getName() {
        return name;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public int getDisplayTime() {
        return displayTime;
    }
}