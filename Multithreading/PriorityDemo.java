package Multithreading;

class priorityExample extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"priority"+Thread.currentThread().getPriority());
		
	}
}
public class PriorityDemo {

	public static void main(String[] args) {
		priorityExample p1 = new priorityExample();
		priorityExample p2 = new priorityExample();

		p1.setPriority(Thread.MIN_PRIORITY);  //priority=1
		p2.setPriority(Thread.MAX_PRIORITY); //Priority=10
		
		p1.start();
		p2.start();
	}

}
