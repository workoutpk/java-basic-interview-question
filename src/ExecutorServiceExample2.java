import java.util.concurrent.*;

public class ExecutorServiceExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Creating the object of the
        // Executor service interface
        ExecutorService executorService   = Executors.newFixedThreadPool(1);
        Future obj = executorService.submit(new Callable() {

            // Overriding the call method
            public Object call()
            {
                System.out.println(
                        "This is submit() "
                                + "method example");

                return "Returning Callable "
                        + "Task Result";
            }
        });

        // This method will return the result
        // if the task has finished perfectly.
        // The submit() method returns a
        // Java Future object which is
        // used to check when the Runnable
        // has completed.
        // As it implements Future,
        // get() method is called
        // to get the result
        System.out.println(obj.get());
        executorService.shutdown();
    }
}
