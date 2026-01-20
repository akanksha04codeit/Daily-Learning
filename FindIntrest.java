import java.util.Scanner;

public class FindIntrest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		find compound interest
		
	    System.out.println("Enter Principal amount");
		double principal = sc.nextDouble();
		
		System.out.println("Enter annual Intrest rate");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the times interest");
		int perYear = sc.nextInt();
		
		System.out.println("Enter the time in years");
		int time = sc.nextInt();
		
		rate = rate/100;
		
		double amount = principal * Math.pow(1+(rate/perYear), perYear*time);
		double interest = amount - principal;
		
		System.out.println("Compound intrest: "+interest);
		System.out.println("Total amount after "+time+" perYears: "+amount);

		sc.close();
	}
	
}