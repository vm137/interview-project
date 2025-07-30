package functional;

import java.util.function.Function;

public class App {

    Function<String, Integer> function;

    public App(Function<String, Integer> function) {
        this.function = function;
    }

    public static void main(String[] args) {
        App app = new App(s -> s.length());
        System.out.println(app.function.apply("Hello World!"));
    }
}
