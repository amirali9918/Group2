public class HelloWorldWithThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        Thread myThread2 = new Thread(new MyThread2());
//
        myThread1.start();
        myThread2.start();
//        for (int i = 0; i < 5; i++) {
//
//        }

    }

}
