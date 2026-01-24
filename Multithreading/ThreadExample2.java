package Multithreading;

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is working...");
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(), "Worker-1");
        Thread t2 = new Thread(new Task(), "Worker-2");

        t1.start();
        t2.start();
    }
}
