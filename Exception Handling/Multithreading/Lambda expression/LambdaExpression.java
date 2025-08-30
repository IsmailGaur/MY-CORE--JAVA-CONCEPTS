import java.util.*;

interface Greeting {
    void sayHello();

}

public class LambdaExpression {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hey this is lambda expression: ");
        g.sayHello();
    }

}
