public class Exceptio2 {
    public static int IsArray(int arr[]) {
        System.out.println(arr.length);
        try {
            arr[6] = 10 / 0;
            System.out.println(arr);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 76, 8 };
        System.out.println(IsArray(arr));

    }
}
