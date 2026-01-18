package Multithreading;

//DeadLock is the two tasks are waiting for each others complete their execution

//wait, notify method communicate with each other to know each others to task is completed or not

class Message{
	private String msg;
	
	public synchronized void sendMessage(String msg) {
		this.msg=msg;
		System.out.println("Sending: "+msg);
		notify();  //notify waiting thread
	}
	public synchronized void receiveMessage() {
		try {
			wait();
		}catch (InterruptedException e) {
			
		}
		System.out.println("Received: "+msg);
	}
}
public class WaitNotifyExample {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		Thread sender=new Thread(()->message.sendMessage("Hello"));
		Thread receiver=new Thread(()->message.receiveMessage());
		
		sender.start();
		receiver.start();
	}

}

