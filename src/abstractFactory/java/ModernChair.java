package abstractFactory.java;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("There are no legs in modern chair");
    }

    @Override
    public void sitOn() {
        System.out.println("It is not very comfortable to sit on a modern chair cut looks nice");
    }
}
