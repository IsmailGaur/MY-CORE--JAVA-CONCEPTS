import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {
    private int data = 0;
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();

    public void read(String threadName) {
        readLock.lock();
        try {
            System.out.println(threadName + " is reading the data : " + data);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        } finally {
            readLock.unlock();
        }

    }

    public void write(String threadName, int value) {
        writeLock.lock();
        try {
            System.out.println(threadName + " is writing data : " + value);

            data = value;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        } finally {
            writeLock.unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String args[]) {
        SharedResource resource = new SharedResource();

        for (int i = 0; i <= 3; i++) {
            final int t = 1;
            new Thread(() -> {
                resource.read("Reader-1" + t);
            }).start();

            new Thread(() -> {
                resource.write("Writer -1", 100);
            }).start();

            new Thread(() -> {
                resource.read("Reader- 4");
            }).start();
        }
    }
}