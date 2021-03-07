package abstractFactory.java;

public class VictorianSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa has 4 wooden legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on Victorian sofa freely");

    }
}
