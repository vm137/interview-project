package main.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {

  void m1() throws ExecutionException, InterruptedException {
    Executor executor = Executors.newSingleThreadExecutor();
    executor.execute(() -> System.out.println("Hello World"));

    ExecutorService executorService = Executors.newFixedThreadPool(10);
    Future<String> future = executorService.submit(() -> "Hello World");
    // some operations
    String result = future.get();
  }

  void m2() {
    ThreadPoolExecutor executor =
        (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    executor.submit(() -> {
      Thread.sleep(1000);
      return null;
    });
    executor.submit(() -> {
      Thread.sleep(1000);
      return null;
    });
    executor.submit(() -> {
      Thread.sleep(1000);
      return null;
    });

//    assertEquals(2, executor.getPoolSize());
//    assertEquals(1, executor.getQueue().size());
  }
}
