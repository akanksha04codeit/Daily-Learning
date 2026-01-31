package ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
          //  int a = 10 / 0;  ArithmeticException

            int[] arr = {1,2,3};
            System.out.println(arr[5]); // ArrayIndexOutOfBounds

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid!");
        }

        System.out.println("Program continues...");
    }
}

