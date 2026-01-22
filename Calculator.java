import java.util.Scanner;
public class Calculator {

	public static void getNumber(double[] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		numbers[0] = sc.nextDouble();
		System.out.println("Enter second number");
		numbers[1] = sc.nextDouble();
		//sc.close();
	}
	
	public static void cal(double[] numbers, double[] result, int choice) {
		switch(choice) {
		case 1: 
			result[0]=numbers[0] + numbers[1];
			break;
		case 2: 
			result[0]=numbers[0] - numbers[1];
			break;
		case 3: 
			result[0]=numbers[0] * numbers[1];
			break;
		case 4: 
			result[0]=numbers[0] / numbers[1];
			break;
		case 5: 
			result[0]=numbers[0] % numbers[1];
			break;
		}
	}
	
	public static void disResult(double[] res) {
		System.out.println("Result: "+res[0]);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double[] numbers = new double[2];
		double[] result = new double[1];
		
		do {
			System.out.println("Arithematic Operation");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Module");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();			
			if(choice >=1 && choice <=5) {
				getNumber(numbers);
				cal(numbers, result, choice);
				disResult(result);
				
			}else if(choice==6) {
				System.out.println("Thank you...");
			}else {
				System.out.println("Invalid choice");
			}
		}while(choice !=6);
		
		sc.close();
	}

}
