package ExceptionHandling;

class ServiceUnavailableException extends Exception {
    public ServiceUnavailableException(String msg) {
        super(msg);
    }
}

public class RetryMechanism {

    static int attempts = 0;

    static void connectService() throws ServiceUnavailableException {
        attempts++;
        if (attempts < 3) {
            throw new ServiceUnavailableException("Service down. Attempt " + attempts);
        }
        System.out.println("Service connected successfully!");
    }

    public static void main(String[] args) {

        while (attempts < 3) {
            try {
                connectService();
                break;
            } catch (ServiceUnavailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

