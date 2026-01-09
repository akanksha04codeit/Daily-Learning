import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double accBalance = 50000;
		
		System.out.println("Welcome to ABC bank");
		
		System.out.println("Enter your account name:");
		// String accName = sc.next();
		
		System.out.println("Enter your account number:");
		// int accNum = sc.nextInt();
		
		System.out.println("\n Select Account type:");
		System.out.println("1. Saving");
		System.out.println("2. Current");
		System.out.println("3. Salary");
		System.out.println("Enter your choice (1/2/3)");
		int choice = sc.nextInt();
		
		while(choice==1 || choice==2 || choice==3) {
			
			System.out.println("\n Select Transaction type:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice (1/2/3)");
			int transactionType = sc.nextInt();
		
		
		switch(transactionType) {
		    case 1:
		    	System.out.println("Withdraw transaction selected");
		    	System.out.println("Enter the withdrawl amount");
		    	int withBalance = sc.nextInt();
		    	
		    	if(accBalance < withBalance) {
		    		System.out.println("Insufficient Balance");
		    		
			    }else if(accBalance > withBalance) {
			    	double sub = accBalance - withBalance;
			    	System.out.println("Withdrawl is successful!...Now your balance is: "+ sub);
			    }
		    	break;
			
		    case 2:
		    	System.out.println("Deposit transaction selected");
		    	System.out.println("Enter the deposit amount");
		    	int depBalance = sc.nextInt();
		    	
		    	 accBalance += depBalance;
		    	System.out.println("Deposit is successful!...Now your balance is: "+ accBalance);
		    	break;
		    	
		    case 3:
		    	System.out.println("balance:"+accBalance);
		    	break;

		    	
		    default: 
		    	System.out.println("You enter invalid choice");
		}
	}
		sc.close();
	}
}