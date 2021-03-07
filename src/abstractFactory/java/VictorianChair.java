package abstractFactory.java;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("There are 4 legs on each chair styled victorian");

    }

    @Override
    public void sitOn() {
        System.out.println("It's very comfortable to seat on Victorian chair");

    }
}
