package main.hashmapimpl;

public class HashCodeTest {
    public static void main(String[] args) {
        int i = new Object().hashCode();
        int i2 = new Object().hashCode();
        System.out.println(i + ":" + i2);
    }
}
