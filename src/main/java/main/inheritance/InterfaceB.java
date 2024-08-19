package main.inheritance;

public interface InterfaceB {
    default void doSomething() {
        System.out.println("do something B");
    }
}
