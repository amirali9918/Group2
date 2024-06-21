public class HelloWorldWithThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        Thread myThread2 = new Thread(new MyThread2());
//
//        myThread1.start();
//        myThread2.start();
            MyThread myThread = new MyThread();
            myThread.start();
//            MyThread2 thread2 = new MyThread2();
//            thread2.run();


    }

}
