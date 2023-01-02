package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Connection instance = null;

    private Database(){

        String driverName = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driverName);

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
