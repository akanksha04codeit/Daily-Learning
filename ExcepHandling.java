/*create method with exception handling
- method must extract substring from string
- and print substring index*/
public class ExcepHandling {
	static void errExtract(String str, int start, int end) {
		try {
			if(str==null) {
				throw new NullPointerException("Input string is null");
			}
			String substr = str.substring(start, end);
			int index =str.indexOf(substr);
			System.out.println("Substring: "+substr);
			System.out.println("Starting Index: "+index);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Array index out of bound. please provide valid indices");
		}catch(NullPointerException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		ExcepHandling.errExtract("Java Programming", 2, 20); //This will cause an exception array index out of bound
		ExcepHandling.errExtract(null, 2, 2);
	}
}


