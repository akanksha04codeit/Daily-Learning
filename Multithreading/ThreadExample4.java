package Multithreading;

import java.util.concurrent.*;

public class ThreadExample4 {
    public static void main(String[] args) throws Exception {

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) sum += i;
            return sum; // return result
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(task);

        System.out.println("Sum from thread: " + result.get());

        executor.shutdown();
    }
}

