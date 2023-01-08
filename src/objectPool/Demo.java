package objectPool;

public class Demo {
    public static void main(String[] args){
        OliphauntPool pool = new OliphauntPool();
        Oliphaunt oliphaunt1 = pool.checkOut();
        Oliphaunt oliphaunt2 = pool.checkOut();
        Oliphaunt oliphaunt3 = pool.checkOut();

        System.out.println(pool);

        pool.checkIn(oliphaunt1);
        pool.checkIn(oliphaunt2);

        System.out.println(pool);

        Oliphaunt oliphaunt4 = pool.checkOut();
        Oliphaunt oliphaunt5 = pool.checkOut();

        System.out.println(pool);
    }
}
