package main.inheritance;

public interface InterfaceB {
    default void doSomething2() {
        System.out.println("do something B");
    }
}
