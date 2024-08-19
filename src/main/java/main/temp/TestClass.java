package main.temp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClass {

    Logger logger = Logger.getLogger(getClass().getName());
    int counter = 0;

    Thread tr = new Thread(
        () -> {
            counter++;
            logger.log(Level.INFO, "Hello from Thread: {0}", counter);
        }
    );

    void m1() {
        tr.start();
        tr.run();

        synchronized (this) {
            System.out.println("Hello from Thread: " + counter);
        }
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.m1();
    }
}
