import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("The value of c is : " + c);
        } catch (ArithmeticException e) {
            System.out.println("a number can't divide by 0 ");
        }
    }
}