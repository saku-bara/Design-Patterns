package singleton.java;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        //writing some queries here

        Database bar = Database.getInstance();
        bar.query("SELECT ...");
    }
}
