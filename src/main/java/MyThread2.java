public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World! " + Thread.currentThread().getName() +" Id: "+ Thread.currentThread().getId());
    }
}
