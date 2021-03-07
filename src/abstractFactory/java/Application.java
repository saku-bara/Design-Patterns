package abstractFactory.java;

public class Application {
    public static void main(String[] args) {

        FurnitureFactory factory = new VictorianFurnitureFactory();
        Chair obj = factory.createChair();
        obj.sitOn();
        obj.hasLegs();
        System.out.println("--------------------");

        CoffeeTable obj1 = factory.createCoffeeTable();
        obj1.hasLegs();
        obj1.sitOn();
        System.out.println("--------------------");


        FurnitureFactory factory1 = new ModernFurnitureFactory();
        CoffeeTable obj2 = factory1.createCoffeeTable();
        obj2.hasLegs();
    }
}
