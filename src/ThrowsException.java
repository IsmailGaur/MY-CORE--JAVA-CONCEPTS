public class ThrowsException {
    public static void isArray() throws ArrayIndexOutOfBoundsException, NullPointerException {
        int a = 10 / 0;
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        try {
            isArray();
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic error handled: ");
        } catch (NullPointerException e) {
            System.out.println("Null value error handled");
        }
    }

}
