package Multithreading;

class SharedResource{
	synchronized void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			
		}
		System.out.println("]");
	}
}

class SyncThread1 extends Thread{
	SharedResource resource;
	String msg;
	
	public SyncThread1(SharedResource resource, String msg) {
		this.resource = resource;
		this.msg=msg;
	}
	
	public void run() {
		resource.display(msg);
		
	}
}


public class SyncThread {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		Thread t1 = new SyncThread1(resource, "Hello");
		Thread t2 = new SyncThread1(resource, "World");
		
		t1.start();
		t2.start();
	}

}
