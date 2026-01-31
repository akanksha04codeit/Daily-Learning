package ExceptionHandling;

class Task implements Runnable {
    public void run() {
        throw new RuntimeException("Thread failed!");
    }
}

public class ThreadExceptionHandler {

    public static void main(String[] args) {

        Thread t = new Thread(new Task());

        t.setUncaughtExceptionHandler((thread, exception) -> {
            System.out.println("Exception in thread: " + thread.getName());
            System.out.println("Message: " + exception.getMessage());
        });

        t.start();
    }
}

