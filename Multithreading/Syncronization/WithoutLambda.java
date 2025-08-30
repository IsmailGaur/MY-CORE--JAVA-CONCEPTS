interface Greeting {
    void sayHello();
}

public class WithoutLambda {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello , This is without lambda expression: ");
            }
        };
        greeting.sayHello();
    }

}
