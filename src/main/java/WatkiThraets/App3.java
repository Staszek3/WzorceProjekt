package WatkiThraets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class App3 {
    //jest w prezentacji
    private static AtomicInteger sum=new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(2); //nowa pula watku w Javie 8(threata
        es.execute(()->{
            for(int i=0;i<1_000_000;i++){
                sum.incrementAndGet();
            }
        });

        es.execute(()->{
            for(int i=0;i<1_000_000;i++){
                sum.decrementAndGet();
            }
        });

        es.awaitTermination(2, TimeUnit.SECONDS);
        es.shutdown(); //
        System.out.println(sum);

    }
}
