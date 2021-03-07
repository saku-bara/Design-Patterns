package abstractFactory.java;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table has simple yet good looking legs design");
    }

    @Override
    public void sitOn() {
        System.out.println("Please do not sit on modern coffee table, it's made of glass! Only cat's weight is fine");

    }
}
