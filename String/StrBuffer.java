package String;


public class StrBuffer {

	public static void main(String[] args) {
		
		//String Buffer
		StringBuffer str1 = new StringBuffer();
		str1.append("abc");
		str1.insert(2,"Hello");
		System.out.println(str1);
		
		str1.deleteCharAt(2);
		System.out.println(str1);
		System.out.println(str1.reverse());
		
		StringBuffer str2 = new StringBuffer();
		System.out.println("Capacity of str2: "+str2.capacity());
		
		str2.ensureCapacity(15);
		System.out.println("Capacity-1: Capacity of str2: "+str2.capacity());
		
		str2.ensureCapacity(20);
		System.out.println("New capacity= 20: Capacity of str2: "+str2.capacity());
		//(existing capacity*2)+2
		//(16*2)+2 = 34
		
		
		//String Builder
		StringBuilder newStr = new StringBuilder();
		
		newStr.append("abc");
		newStr.insert(2,"Hello");
		System.out.println(str1);
		
		str1.deleteCharAt(2);
		System.out.println(str1);
		System.out.println(str1.reverse());
		
		StringBuffer newStr2 = new StringBuffer();
		System.out.println("Capacity of str2: "+newStr2.capacity());
		
		newStr2.ensureCapacity(15);
		System.out.println("Capacity-1: Capacity of str2: "+newStr2.capacity());
		
		str2.ensureCapacity(20);
		System.out.println("New capacity= 20: Capacity of str2: "+newStr2.capacity());

	}
	

}

