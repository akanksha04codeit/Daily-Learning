package String;


public class StrMethods {

	
		
	/*String str1 = "Hello";
	String str2 = "Hello";
	String str3 = "hello";
	String str4 = new String("Heloo");
	String str5 = str1.concat(str4);
	String str6 = str1+str3;
	boolean eql=str1.equals(str2);
	boolean compare = str1==str2;
	int a=str1.compareTo(str4);
	char x= str2.charAt(2);
	int index=str1.indexOf('o');
	int len=str2.length();
	System.out.println(str5.replace('l', 'j'));*/
	
	void convert(){
		
	String str1 = "Welcome";
	String str2 ="Helloo";
	
	byte[] byteArray = str1.getBytes();
	char[] charArray = new char[5];
	
	str2.getChars(0,4, charArray,0);
	
	int hash = str1.hashCode();
	System.out.println("Hash value: "+hash);
	
	for(byte itr:byteArray) {
		System.out.println("CharArray Element: "+itr);
	}
	for(char itr1:charArray) {
		System.out.println("CharArray Element: "+itr1);
	}
	
	
	}
	
	public static void main(String[] args) {
		
		StrMethods obj = new StrMethods();
		obj.convert();
		
		
	}

}
