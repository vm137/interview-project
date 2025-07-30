package temp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Application {

    public static void main(String[] args)
        throws InterruptedException, ExecutionException, TimeoutException {
        Application app = new Application();
        app.showSearch("ww");
    }

    ExecutorService executor = new ForkJoinPool();
    ArchiveSearcher searcher = new ArchiveSearcher();

    void showSearch(String target) throws InterruptedException, TimeoutException,
        ExecutionException {
        Callable<String> task = () -> searcher.search(target);
        Future<String> future = executor.submit(task);
//        displayOtherThings(); // do other things while searching

        System.out.println(future.isDone());
        System.out.println(future.get(500, TimeUnit.MICROSECONDS));
        System.out.println("---");

        try {
            Thread.sleep(2000);
            System.out.println(future.isDone());
            System.out.println(future.get(2, TimeUnit.SECONDS));
            //            displayText(future.get()); // use future
        } catch (ExecutionException ex) {
        }

        Thread rl = new Thread();
        rl.start();
    }


//    public synchronized Integer m2() {
//        return 0;
//    }
}

class ArchiveSearcher {

    public String search(String target) throws InterruptedException {
        Thread.sleep(1000);
        return "target=" + target;
    }
}
