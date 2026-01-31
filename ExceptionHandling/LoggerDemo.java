
package ExceptionHandling;
import java.time.LocalDateTime;
class Logger {
    static void log(Exception e) {
        System.out.println(
            "[" + LocalDateTime.now() + "] ERROR: " + e.getClass().getName()
            + " - " + e.getMessage()
        );
    }
}

public class LoggerDemo {

    public static void main(String[] args) {

        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]);

        } catch (Exception e) {
            Logger.log(e);
            System.out.println("User-friendly message: Something went wrong.");
        }
    }
}

