import java.util.concurrent.*;

public class HelloWorldWithThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        Thread myThread2 = new Thread(new MyThread2());
//
//        myThread1.start();
//        myThread2.start();

            ExecutorService executorService = Executors.newFixedThreadPool(5);
            int counter=0;
        for (int i = 0; i <50 ; i++) {
            executorService.submit(new MyThread());
            counter++;
        }

executorService.awaitTermination(6000L, TimeUnit.MILLISECONDS);
       // System.out.println(counter);
        executorService.shutdownNow();


//            myThread.start();
//            myThread.join();
//            MyThread2 thread2 = new MyThread2();
//            thread2.run();
        System.out.println("End of program");
    }

}
