package singleton;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        Connection foo = Database.getInstance();
        Connection bar = Database.getInstance();
        System.out.println(foo.equals(bar));
    }
}
