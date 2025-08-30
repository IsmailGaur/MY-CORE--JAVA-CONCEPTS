import java.util.*;
import java.util.concurrent.*;

public class ScheduledExecutorServices {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        scheduler.schedule(() -> {
            System.out.println("Delayed task executed by " + Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Repeating Task executed by " + Thread.currentThread().getName());
        }, 1, 2, TimeUnit.SECONDS);

        // Let it run for 10 seconds before shutting down
        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Scheduler shutdown.");
        }, 10, TimeUnit.SECONDS);

    }

}
