package objectPool;

import java.util.concurrent.atomic.AtomicInteger;

public class Oliphaun {
    private static final AtomicInteger counter = new AtomicInteger(0);

    private int id;

    public void Oliphaunt() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}
