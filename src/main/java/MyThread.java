import java.io.File;

public class MyThread extends Thread {
    static double size = 0;
    int counter = 0;

    @Override
    public void run() {

//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getState());
//            System.out.println("Hello World! " + Thread.currentThread().getName() +" Id: "+ Thread.currentThread().getId()+"//"+counter);
//            counter++;
//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

    public synchronized double getSize(File directory) {
        File[] directoryContents = directory.listFiles();
        if (directoryContents == null) {
            return size;
        }
        if (directoryContents == null) {
            return size;
        }

        for (File file : directoryContents) {
            if (file != null) {
                if (file.isFile()) {
                    size += file.length();
                }
                // If it's a directory, recursively call getDirectorySize to calculate its size
                else if (file.isDirectory()) {
                    size += getSize(file);
                }
            } else {

            }
        }
        return size;
    }
}
