package WatkiThraets;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ExecutorService es = Executors.newFixedThreadPool(1);
//        ExecutorService es= new Executors.newFixedThreadPool(1);
        es.execute(() -> {
            System.out.println("Moj nowy watek3" + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello3");
            }
        });
        es.shutdown(); //wyłącza watek ktory cały czas w gotowości
    }
}
