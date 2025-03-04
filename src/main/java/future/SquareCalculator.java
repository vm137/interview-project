package future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SquareCalculator {

    private static final ExecutorService executor
        = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }

    public static void main(String[] args)
        throws InterruptedException, ExecutionException, TimeoutException {
        SquareCalculator calculator = new SquareCalculator();
        Future<Integer> future = calculator.calculate(10);

        while (!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(300);
        }

        Integer result = future.get(500, TimeUnit.MILLISECONDS);
        System.out.println(result);

        boolean canceled = future.cancel(true);
        System.out.println(canceled);

        executor.shutdown();
    }

}
