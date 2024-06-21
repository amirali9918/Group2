public class MyThread extends Thread{
    int counter = 0;
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World! " + Thread.currentThread().getName() +" Id: "+ Thread.currentThread().getId()+"//"+counter);
            counter++;
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
