package main.inheritance;

public interface InterfaceA {
    default void doSomething() {
        System.out.println("do something A");
    }
}
