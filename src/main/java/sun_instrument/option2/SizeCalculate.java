package sun_instrument.option2;

// Java program to calculate the size of an object
// Importing required classes

import java.lang.instrument.Instrumentation;

/**
 * https://www.geeksforgeeks.org/calculate-size-of-object-in-java/
 */

public class SizeCalculate {
    // Volatile variable to hold the global Instrumentation instance
    private static volatile Instrumentation globalInstrumentation;

    // premain method to initialize the Instrumentation instance
    public static void premain(String agentArgs, Instrumentation inst) {
        globalInstrumentation = inst;
    }

    // Method to get the size of an object
    public static long getObjectSize(Object object) {
        if (globalInstrumentation == null) {
            throw new IllegalStateException("Agent not initialized.");
        }
        return globalInstrumentation.getObjectSize(object);
    }

    // Main driver method
    public static void main(String[] args) {
        String example = "GeeksforGeeks";
        System.out.println("Size of the object: " + getObjectSize(example) + " bytes");
    }
}
