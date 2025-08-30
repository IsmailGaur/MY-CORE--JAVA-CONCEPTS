import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        try {
            if (age <= 18) {
                throw new Exception("You are not eligible for Vote!!! ");
            }
            System.out.println("You are eligible to vote!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
