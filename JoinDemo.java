
class joinExample extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}
public class JoinDemo {

	public static void main(String[] args) {
		joinExample j1 = new joinExample();
		joinExample j2 = new joinExample();

		j1.start();
		try {
			j1.join();
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		j2.start();
	}

}
