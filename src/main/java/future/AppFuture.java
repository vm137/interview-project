package future;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Future class represents a future result of an asynchronous computation.
 * This result will eventually appear in the Future after the processing is complete.
 *
 */
public class AppFuture {

    void calculate() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future
            = CompletableFuture.supplyAsync(() -> "Hello Async");
 
        // ...

        System.out.println("Hello: " + future.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AppFuture app = new AppFuture();
        app.calculate();
    }
}
