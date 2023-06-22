import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        // Creating the object of the
        // Executor Service
        ExecutorService executorService   = Executors.newSingleThreadExecutor();
        // execute() method cannot return
        // anything because it's return type
        // is void.

        // By using execute(), we are accepting
        // a Runnable task
        executorService.execute(new Runnable() {

            // Override the run method
            public void run()
            {
                System.out.println( "This is execute() " + "method example");
            }
        });

        // This method performs all the
        // previous submitted tasks
        // before termination
        executorService.shutdown();
    }
}
