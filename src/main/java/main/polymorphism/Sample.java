package main.polymorphism;

class Sample {
    public void display() {
        System.out.println("Initial Method");
    }
}

 class Demo extends Sample {
    public void display() {
        System.out.println("Overriding Method");
    }

    public static void main(String args[]) {
        Sample obj = new Demo();
        obj.display();
    }
}
