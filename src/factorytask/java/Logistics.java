package factorytask.java;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
    }
    public abstract Transport createTransport();

    public static void main(String[] args) {
        Logistics s = new RoadLogistics();

        System.out.println(s.createTransport());

        Transport tr= new Truck();
        tr.deliver();

        Transport sea= new Ship();
        sea.deliver();

    }

}
