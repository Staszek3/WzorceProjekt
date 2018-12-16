package WatkiThraets;

public class App {
    public static void main(String[] args) {
        // wyswietla nazwe bieżcego watku
        System.out.println(Thread.currentThread().getName());
        Thread thread=new Thread(new Async());
        thread.start(); //urochomienie watku

        Thread thread1=new Async2();
    }
    private static class Async implements Runnable{

        @Override
        public void run() {
            System.out.println("Moj nowy watek" +Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                System.out.println("Hello");
            }
        }
    }

    private static class Async2 extends Thread{
        public void run() {
            System.out.println("Moj nowy watek2" + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        }

    }
}
