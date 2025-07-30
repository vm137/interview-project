package concurrency;

public class AppWait {

    private void m1() throws InterruptedException {

        Runnable op1 = () -> System.out.println("listOperations 1");
        Runnable op2 = () -> {
            synchronized (this) {
                try {
                    wait(5000, 0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("listOperations 2");
        };

        Thread thread1 = new Thread(op1);
        Thread thread2 = new Thread(op2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }


    public static void main(String[] args) throws InterruptedException {
        AppWait appWait = new AppWait();
        appWait.m1();
    }
}
