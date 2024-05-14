package java21;

public class VirtualThreads {
    public static void main(String[] args) {
        final int numberOfThreads = 1_000_000;

        for (int i = 0; i < numberOfThreads; i++) {

            Thread virtualThread = Thread.ofVirtual().unstarted(new BlockedThread(i));

            virtualThread.start();

            String str = String.format("Java 21 virtual thread number %s is running.", i);

            System.out.println(str);

        }
    }
}

class BlockedThread implements Runnable {
    private final int id;

    public BlockedThread(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Running virtual thread " + id);
    }
}
