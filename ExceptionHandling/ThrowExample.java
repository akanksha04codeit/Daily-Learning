package ExceptionHandling;

public class ThrowExample {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote.");
        }
        System.out.println("Eligible to vote!");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

