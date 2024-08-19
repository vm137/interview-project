package main.java21;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static Logger logger = Logger.getLogger("application.logger");

    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord("a", "b");
        logger.log(Level.INFO, sr.name());


    }
}
