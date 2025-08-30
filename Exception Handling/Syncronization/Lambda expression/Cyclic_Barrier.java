import java.util.*;
import javav.util.concurrent.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Cyclic_Barrier {
    public static void main(String[] args) {
        int NumberOfPlayers = 4;

        CyclicBarrier barrier = new CyclicBarrier(NumberOfPlayers, () -> {
            System.out.println("All players are ready! Game starts now! .... ");
        });

        for (int i = 0; i <= NumberOfPlayers; i++) {
            Thread player = new Thread(new Player(barrier, "Player-" + i));
            player.start();
        }
    }

}

class Player implements Runnable {
    private CyclicBarrier barrier;
    private String name;

    public Player(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is ptreparing.... ");
            Thread.sleep((int) (Math.random() * 3000));
            System.out.println(name + " is ready waiting at barrier... ");

            barrier.await();

            System.out.println(name + "Starts playing!");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
