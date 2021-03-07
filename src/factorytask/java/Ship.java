package factorytask.java;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Product delivered via sea transport");
    }
}
