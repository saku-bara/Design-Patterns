package factorytask.java;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Product was delivered via Road transport");
    }
}
