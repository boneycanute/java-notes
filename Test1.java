abstract class Parent1 {
    int a = 10;

    // abstract method
    abstract void print(); // method without an implementation

    // not abstract
    void something() {
        System.out.println("Something");
    }
}

interface Parent2 {
    int a = 10; // final

    // abstract method
    abstract void print(); // method without an implementation

    // abstract method
    abstract void something();
}

class Child1 implements Parent2 {

    public void print() {
        System.out.println("Child1");
    }

    public void something() {
        a = a + 10;
        System.out.println("Something from Child1");
    }
}

class Test1 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.something();
    }
}