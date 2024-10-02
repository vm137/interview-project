package bnpparibas;

public class Singleton {
    private static Singleton instance;

    public Singleton() {
        if (instance == null) {
            instance = this;
        }
    }

    void m1() {
    }

    Singleton getSingleton() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton singleton2 = new Singleton();

        Singleton singleton1 = singleton2.getSingleton();
        singleton1.m1();
    }
}
