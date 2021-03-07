package abstractFactory.java;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa does not have any legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Feel free to sit on Modern Sofa");

    }
}
