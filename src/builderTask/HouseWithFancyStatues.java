package builderTask;

public class HouseWithFancyStatues {
    String walls;
    int windows;
    int doors;
    int rooms;
    boolean hasGarage;
    boolean hasSwimmingPool;
    boolean hasStatues;
    boolean hasGarden;

    public String getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public HouseWithFancyStatues(String walls, int windows, int doors, int rooms,
                                 boolean hasGarage, boolean hasSwimmingPool,
                                 boolean hasStatues, boolean hasGarden) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "HouseWithFancyStatues has \n " +
                " walls " + walls + '\n' +
                " windows " + windows + '\n' +
                " doors " + doors + '\n' +
                " rooms " + rooms + '\n' +
                " hasGarage " + hasGarage + '\n' +
                " hasSwimPool " + hasSwimmingPool + '\n' +
                " hasStatues " + hasStatues + '\n' +
                " hasGarden " + hasGarden + '\n';
    }
}
