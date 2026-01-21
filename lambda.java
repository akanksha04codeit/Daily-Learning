
public class lambda {
	
	
	public static void main(String[] args) {
		funcInter1 greetMsg =()->System.out.println("Hello");
		greetMsg.greet();
		
		funcInter2 add=(a,b)->a+b;System.out.println("Add performed");
		System.out.println(add.addition(5, 6));
		
		//Multi-line Lambda 
		funcInter3 GreetM =(str)->{
			System.out.println("Hii");
			System.out.println(str+123);
			return str;
		};
		GreetM.GreetMsg2("Welcome");
//		System.out.println(str2);
	}

}
interface funcInter1{
	void greet();
}
interface funcInter2{
	int addition(int a, int b);
}
interface funcInter3 {
	String GreetMsg2(String str);
}

