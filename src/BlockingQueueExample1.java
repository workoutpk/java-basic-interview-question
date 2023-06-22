import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueExample1 {
        public static void main(String[] args) throws InterruptedException, IllegalStateException {
                // define capacity of ArrayBlockingQueue
                int capacity = 5;
                // create object of ArrayBlockingQueue
                BlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);
                // Add elements to ArrayBlockingQueue using put
                // method
                queue.put("StarWars");
                queue.put("SuperMan");
                queue.put("Flash");
                queue.put("BatMan");
                queue.put("Avengers");

                // print Queue
                System.out.println("queue contains " + queue);

                // remove some elements
                queue.remove();
                queue.remove();

                // Add elements to ArrayBlockingQueue
                // using put method
                queue.put("CaptainAmerica");
                queue.put("Thor");

                System.out.println("queue contains " + queue);

                // create object of BlockingQueue
                BlockingQueue<Integer> BQ = new LinkedBlockingDeque<Integer>();

                // Add numbers to the BlockingQueue
                BQ.add(7855642);
                BQ.add(35658786);
                BQ.add(5278367);
                BQ.add(74381793);

                // before removing print BlockingQueue
                System.out.println("Blocking Queue: " + BQ);
        }
}
