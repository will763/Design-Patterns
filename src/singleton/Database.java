package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Connection instance = null;

    private Database(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            instance= DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/user","will","12345");

            System.out.println("Status ---> connection created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (instance == null){
            new Database();
            return instance;
        }

        return instance;
    }
}
