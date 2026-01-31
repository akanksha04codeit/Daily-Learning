package ExceptionHandling;

class ValidationException extends Exception {
    public ValidationException(String msg) {
        super(msg);
    }
}

class Validator {

    static void validateEmail(String email) throws ValidationException {
        if (!email.contains("@")) {
            throw new ValidationException("Invalid email format");
        }
    }

    static void validateAge(int age) throws ValidationException {
        if (age < 18) {
            throw new ValidationException("Age must be 18+");
        }
    }
}

public class CentralValidationSystem {

    public static void main(String[] args) {

        try {
            Validator.validateEmail("testgmail.com");
            Validator.validateAge(16);

        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}

