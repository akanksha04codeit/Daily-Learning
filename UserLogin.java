import java.util.Scanner;

public class UserLogin {

		String userName, password, emailId;
		Long pNo;
		
		UserLogin(String a, String b, String c, long d){
			userName = a;
			password = b;
			emailId = c;
			pNo = d;
		}
		
		void getUserLogin() {
			System.out.println("====User Information====");
			System.out.println("Username: "+userName);
			System.out.println("password: "+password);
			System.out.println("Email ID: "+emailId);
			System.out.println("Phone no: "+pNo);
		}
	}

	class Info{
		public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Username: ");
		String uName = s.nextLine();
		System.out.println("Enter Password: ");
		String pass = s.nextLine();
		System.out.println("Enter Email ID: ");
		String email = s.nextLine();
		System.out.println("Enter Phone no: ");
		Long phone= s.nextLong();
		
		UserLogin ob = new UserLogin(uName, pass, email, phone);
		ob.getUserLogin();
		
		s.close();
		}
	}


