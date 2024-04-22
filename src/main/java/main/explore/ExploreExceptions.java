package main.explore;

public class ExploreExceptions {
    public static void main(String[] args) {
        ExploreExceptions tmp = new ExploreExceptions();
        tmp.method();
    }

    void method() {
        try {
            throw new ExceptionOne();
        } catch (ExceptionOne ex1) {
            System.out.println("ExceptionOne");
        }
        finally {
            throw new ExceptionTwo();
        }
    }

    class ExceptionOne extends RuntimeException {
        ExceptionOne() {
            super();
        }
    }


    class ExceptionTwo extends RuntimeException {
        ExceptionTwo() {
            super();
        }
    }

    static void m1() {
        throw new RuntimeException("m1");
    }

    static void m2() {
        throw new RuntimeException("m2");
    }
}
