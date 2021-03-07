package singleton.java;

public class Database {
    private static Database instance;
    private Database() {};
    public static Database getInstance() {
      if (Database.instance ==null) {
          Database.instance = new Database();
      }
      return Database.instance;
    }

    public void query (String sql){
        // all queries to database will go trough this method
    }
}
