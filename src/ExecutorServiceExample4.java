import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ExecutorServiceExample4 {
    public static void main(String[] args) {
        Executor executor = new CompletableFuture<>().defaultExecutor();
        CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(() -> "Deepak", executor);

        // Should be avoided, only for demonstration purpose

        System.out.println(nameFuture.join());
    }
}
