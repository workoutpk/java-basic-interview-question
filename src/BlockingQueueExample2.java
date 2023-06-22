import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueExample2 {
    public static void main(String[] args) {
        // Instantiate an object of LinkedBlockingDeque

        BlockingQueue<Integer> blockingDeque = new LinkedBlockingDeque<Integer>();

        // Add elements using add()
        blockingDeque.add(75);
        blockingDeque.add(86);
        blockingDeque.add(13);
        blockingDeque.add(44);
        blockingDeque.add(10);

        // Print the elements of lb on the console
        System.out.println(
                "The LinkedBlockingDeque, contains:");
        System.out.println(blockingDeque);

        // Remove elements using remove();
        blockingDeque.remove(86);
        blockingDeque.remove(44);

        // Trying to remove an element
        // that doesn't exist
        // in the LinkedBlockingDeque
        blockingDeque.remove(1);

        // Print the elements of lbdq on the console
        System.out.println(
                "\nThe LinkedBlockingDeque, lbdq contains:");
        System.out.println(blockingDeque);
    }
}
