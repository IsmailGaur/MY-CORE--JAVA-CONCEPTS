class A {
    public void printA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    public void print() {
        System.out.println("Class B method");
    }
}

class C extends A {
    public void printC() {
        System.out.println("Classd C method");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        B obj = new B();
        C obj1 = new C();
        obj.print();
        obj1.printC();

    }
}