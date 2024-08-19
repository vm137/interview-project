package main.inheritance;

public class Class_D implements InterfaceA//, InterfaceB
{

    // same method is declared in InterfaceA and InterfaceB both
//    public void doSomething();

    public static void main(String[] args) {
        Class_D ic = new Class_D();
        ic.doSomething();
    }
}
