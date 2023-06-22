import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {
        public static Future<String> calculateAsync() throws InterruptedException {
                CompletableFuture<String> completableFuture = new CompletableFuture<>();

                Executors.newCachedThreadPool().submit(() -> {
                        Thread.sleep(500);
                        completableFuture.complete("Hello");
                        return null;
                });

                return completableFuture;
        }

        public static void main(String[] args) throws InterruptedException, ExecutionException {

                Future<String> completableFuture1 = calculateAsync();
                String result = completableFuture1.get();
                System.out.println(result);

                CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> "Hello");

                CompletableFuture<String> future = completableFuture2.thenApply(s -> s + " World");

//        assertEquals("Hello World", future.get());

                CompletableFuture<String> future1
                        = CompletableFuture.supplyAsync(() -> "Hello");
                CompletableFuture<String> future2
                        = CompletableFuture.supplyAsync(() -> "Beautiful");
                CompletableFuture<String> future3
                        = CompletableFuture.supplyAsync(() -> "World");

                CompletableFuture<Void> combinedFuture
                        = CompletableFuture.allOf(future1, future2, future3);

// ...

                combinedFuture.get();

//        assertTrue(future1.isDone());
//        assertTrue(future2.isDone());
//        assertTrue(future3.isDone());

        }
}
