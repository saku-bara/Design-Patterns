package abstractFactory.java;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Coffee Table has 4 short legs");
    }

    @Override
    public void sitOn() {
        System.out.println("It is not recommended to sit on Victorian coffee table");

    }
}
