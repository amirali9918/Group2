
    import java.io.File;
    public class DirectoryFile {
        // Recursively calculate the size of a directory
        public synchronized static double getDirectorySize(File directory) {
            double size = 0;

            // Get an array of all the files and directories inside the given directory
            File[] directoryContents = directory.listFiles();

            for (int i = 0; i < directoryContents.length; i++) {
                if (directoryContents[i] == null) {
                    continue;
                }
                    MyThread myThread = new MyThread();
                    //myThread.start();
                    size+= myThread.getSize(directoryContents[i]);K
            }
            // If the directory is empty, return a size of 0

            return size;
        }

        public static void main(String[] args) {
            // Create a File object for the directory whose size we want to calculate
            File directory = new File("D:\\");

            // Get the size of the directory in bytes

                double sizeInBytes = getDirectorySize(directory);

            // Convert the size to kilobytes and megabytes
            double sizeInKilobytes = sizeInBytes / 1024.0;
            double sizeInMegabytes = sizeInKilobytes / 1024.0;
            double sizeInGigabytes = sizeInMegabytes / 1024.0;

            // Print the size of the directory in bytes, kilobytes, and megabytes
            System.out.println("Size of directory " + directory.getAbsolutePath() + ":");
            System.out.println("  " + sizeInBytes + " bytes");
            System.out.println("  " + sizeInKilobytes + " KB");
            System.out.println("  " + sizeInMegabytes + " MB");
            System.out.println("  " + sizeInGigabytes + " GB");

            // Print the number of files and directories in the directory
            int numFiles = 0;
            int numDirectories = 0;

            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    numFiles++;
                } else if (file.isDirectory()) {
                    numDirectories++;
                }
            }

            System.out.println("Number of files: " + numFiles);
            System.out.println("Number of directories: " + numDirectories);

            // Print the last modified time of the directory
            long lastModified = directory.lastModified();
            System.out.println("Last modified: " + lastModified);
        }
    }

