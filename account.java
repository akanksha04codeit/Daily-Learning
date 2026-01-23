import java.util.Scanner;

public class account {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float accBalance = 50000;
		
		System.out.println("Enter your account name:");
		String accName = sc.next();
		
		System.out.println("Enter your account number:");
		int accNum = sc.nextInt();
		
		System.out.println("Enter Withdrawl balance");
	    int withBalance = sc.nextInt();
	    
	    if(accBalance < withBalance) {
	    	System.out.println("Insufficient Balance");
	    }else if(accBalance > withBalance) {
	    	float sub = accBalance - withBalance;
	    	System.out.println("Your Withdrawl is successful!...Now your balance is: "+ sub);
	    }
		
		sc.close();

	}

}

