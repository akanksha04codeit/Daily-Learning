
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	//area of rectangle
		System.out.println("Enter length of the rectangle");
		double len = sc.nextDouble();
		System.out.println("Enter width of the rectangle");
		double wid = sc.nextDouble();
		
		double area = len*wid;
		System.out.println("Area of the reactangle is: "+area);

        sc.close();
     }

}