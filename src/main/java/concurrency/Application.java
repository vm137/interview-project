package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

//    synchronized Application() {
//
//    }

    private void m1() throws InterruptedException {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());

        Runnable listOperations = () -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(syncCollection.size());

        // ----
        List<String> syncCollection2 = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
        List<String> uppercasedCollection = new ArrayList<>();

        Runnable listOperations2 = () -> {
            synchronized (syncCollection2) {
                syncCollection2.forEach((e) -> {
                    uppercasedCollection.add(e.toUpperCase());
                });
            }
        };
        Thread thread3 = new Thread(listOperations2);
        thread3.start();
        thread3.join();

        System.out.println(uppercasedCollection);

        boolean interrupted = Thread.interrupted();

//        Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {});
//
//        new FutureTask<>(C, result);

    }


    public static void main(String[] args) throws InterruptedException {
        Application app = new Application();
        app.m1();
    }
}
