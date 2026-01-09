
import java.util.Scanner;

public class mk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String name = sc.nextLine();
		
		System.out.println("Enter marks of English:");
		double eng = sc.nextDouble();
		System.out.println("Enter marks of Maths:");
		double maths = sc.nextDouble();
		System.out.println("Enter marks of Chemistry:");
		double chem = sc.nextDouble();
		System.out.println("Enter marks of Physics:");
		double phy = sc.nextDouble();
		System.out.println("Enter marks of Biology:");
		double bio = sc.nextDouble();
		
		double subAdd= eng+maths+chem+phy+bio;
		double per= (subAdd/500)*100;
		double cgpa= subAdd/5;
		
		System.out.println("Percentage of the student "+name+" is: "+per);
		//System.out.println("CGPA of the student "+name+" is: "+cgpa);
		
		if(per>=80) {
			System.out.println("O grade");
		}else if(per>=60) {
			System.out.println("A grade");
		}else if(per>=40) {
			System.out.println("B garde");
		}else {
			System.out.println("Fail");
		}
	}

}
