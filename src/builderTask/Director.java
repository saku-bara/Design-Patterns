package builderTask;

public class Director {

    public void makeHouseWithGarage(Builder builder) {
        builder.setWindows(13);
        builder.setHasSwimPool(false);
        builder.setHasGarage(true);
        builder.setRooms(3);
        builder.setHasStatues(false);
        builder.setHasGarden(false);
        builder.setWalls("paper");
        builder.setDoors(5);
    }

    public void makeHouseWithGarden(Builder builder) {
        builder.setWindows(16);
        builder.setWalls("cement");
        builder.setHasStatues(false);
        builder.setRooms(26);
        builder.setHasGarden(true);
        builder.setDoors(15);
        builder.setHasGarage(false);
        builder.setHasGarden(true);
        builder.setHasSwimPool(false);
        builder.setHasSwimPool(false);
    }

    public void makeHouseWithSwimmingPool(Builder builder) {
        builder.setWalls("wooden");
        builder.setHasGarage(false);
        builder.setHasStatues(false);
        builder.setDoors(20);
        builder.setHasGarden(false);
        builder.setRooms(2);
        builder.setWindows(13);
        builder.setHasSwimPool(true);
    }

    public void makeHouseWithFancyStatues(Builder builder) {
        builder.setDoors(14);
        builder.setWindows(40);
        builder.setHasSwimPool(false);
        builder.setHasGarage(false);
        builder.setHasGarden(false);
        builder.setWalls("brick");
        builder.setRooms(4);
        builder.setHasStatues(true);
    }


}
