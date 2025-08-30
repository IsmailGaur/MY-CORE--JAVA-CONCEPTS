public class ThreadzCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produceData();
                System.out.println("Produced data " + (i + 1));
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consumeData();
                System.out.println("Consumed data " + (i + 1));
            }
        });

        producer.start();
        consumer.start();
    }
}

class SharedResource {
    boolean dataAvailable = false;

    synchronized void produceData() {
        while (dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        dataAvailable = true;
        notify();
    }

    synchronized void consumeData() {
        while (!dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        dataAvailable = false;
        notify();
    }
}