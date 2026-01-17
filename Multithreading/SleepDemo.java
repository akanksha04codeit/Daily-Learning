package Multithreading;

class sleepExample extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			try{
				System.out.println(Thread.currentThread().getName()+"-"+i);
				Thread.sleep(1000); //sleep for 1sec
			}catch(InterruptedException e){
				System.out.println(e);
			}
			
		}
	}
}
public class SleepDemo {

	public static void main(String[] args) {
		sleepExample s1 = new sleepExample();
		s1.start();
	}

}
