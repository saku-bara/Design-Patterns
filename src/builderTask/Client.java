package builderTask;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        HouseWithGarageBuilder builder = new HouseWithGarageBuilder();
        director.makeHouseWithGarage(builder);
        HouseWithGarage house = builder.getResult();
        System.out.println(house.toString());
        System.out.println("-----------------------------");

        HouseWithSwimmingPoolBuilder builder1 = new HouseWithSwimmingPoolBuilder();
        director.makeHouseWithSwimmingPool(builder1);
        HouseWithSwimmingPool h1 = builder1.getResult();
        System.out.println(h1.toString());
        System.out.println("-----------------------------");


        HouseWithFancyStatuesBuilder h = new HouseWithFancyStatuesBuilder();
        director.makeHouseWithFancyStatues(h);
        HouseWithFancyStatues fancyH = h.getResult();
        System.out.println(fancyH.toString());
        System.out.println("-----------------------------");

        HouseWithGardenBuilder builder2 = new HouseWithGardenBuilder();
        director.makeHouseWithGarden(builder2);
        HouseWithGarden houseP = builder2.getResult();
        System.out.println(houseP.toString());
        System.out.println("-----------------------------");

    }
}
