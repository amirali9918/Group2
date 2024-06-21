public class MyThread extends Thread{
    @Override
    public void run() {
            System.out.println("Hello World! " + Thread.currentThread().getName() +" Id: "+ Thread.currentThread().getId());

    }
}
