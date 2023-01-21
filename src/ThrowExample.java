public class ThrowExample {
    public static void main(String[] args) {
        // Use of unchecked Exception
        try {
//             double x=3/0;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

