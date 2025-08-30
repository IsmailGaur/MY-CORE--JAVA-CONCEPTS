public class FinallyExample {
    public static int isArray(int arr[]) {
        try {
            System.out.println("This is a Finally Block Example: ");
            try {
                arr[6] = 10 / 5;
                System.out.println("Add this element on index 6: ");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                return 0;
            }
            return -1;
        } finally {
            System.out.println("Array contains only the elements of same data-type");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        System.out.println(isArray(arr));

    }

}
