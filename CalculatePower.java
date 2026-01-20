import java.util.Scanner;

public class CalculatePower {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//calculate power of number
		System.out.println("Enter the number to calculate power");
		int number = sc.nextInt();
		
		double power = Math.pow(number, 2);
		System.out.println("Power is: "+power);
         sc.close();
  }
}