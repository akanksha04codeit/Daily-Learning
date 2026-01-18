package Multithreading;

class MyTask implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" running in group "+Thread.currentThread().getThreadGroup().getName());
	}
}
public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("MyGroup");

		Thread t1 = new Thread(group, new MyTask(), "Thread-1");
		Thread t2 = new Thread(group, new MyTask(), "Thread-2");
		
		t1.start();
		t2.start();
		
		System.out.println("Active Threads in Group: "+group.activeCount());
	}

}
