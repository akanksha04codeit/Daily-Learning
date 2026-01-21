
public class garbage {

	public static void main(String[] args) {
		garbage obj1 = new garbage();
		obj1 = null; //making object non-reference
	 //When we initialize the object to the null then JVM can release the memory of it before execution
		
		garbage obj2 = new garbage();
		garbage obj3 = new garbage();
		obj2=obj3;  //
		
		System.gc(); // its used to call garbage collector explicitly
	}
	//finalized
	void finalized() {
		//@Override
		System.out.println("It is a garbage collection method");
	}

}

