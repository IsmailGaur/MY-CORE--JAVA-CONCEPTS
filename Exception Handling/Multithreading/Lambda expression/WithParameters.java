interface Add {
    int add(int x, int y);
}

public class WithParameters {
    public static void main(String[] args) {
        Add add = (x, y) -> x + y;
        System.out.println("Sum of number is: " + add.add(54, 32));

    }

}
