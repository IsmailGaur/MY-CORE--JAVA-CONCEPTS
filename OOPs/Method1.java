import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animals Make Sounds");
    }

}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Method1 {
    public static void main(String agrs[]) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new cat();
        a.sound();
        a1.sound();
        a2.sound();
    }

}
