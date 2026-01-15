import java.util.Scanner;
public class DemoString{
public static void Main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str = s.nextLine().toLowerCase();
	int len = str.length();
	int count = 0;
	
	for(int i=0; i<=len-1; i++) {
		char ch = str.charAt(i);
		switch(ch)
		{
		case 'a':count++;
		break;
		case 'e':count++;
		break;
		case 'i':count++;
		break;
		case 'o':count++;
		break;
		case 'u':count++;
		break;
		}
	}
	System.out.println("Count of vowels: "+count);
	s.close();
}
}