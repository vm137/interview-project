package main.temp;

public class Factorial {
    public static void main(String[] args) {
        int num = 12;
        int factorial = fact(num);
        System.out.println("Factorial of " +  num + " : " + factorial);
    }

    static int fact(int n) {
        int output;
        if (n == 1) {
            return 1;
        }
        // Recursion
        output = fact(n - 1) * n;
        return output;
    }
}
