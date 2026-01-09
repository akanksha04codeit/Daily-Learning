
public class arrayElement {
	

	void forLoop() {
		for(int i=0; i<=5; i++) {
			System.out.println("Elements "+i);		
			}
	}
	
	void forEachLoop(int arr[]) {
		for(int a:arr) {
			System.out.println("Array Element "+a );
		}
	}
	
	void doWhileLoop(int num) {
		int i=1;
		do {
			System.out.println(num+"X"+i+"="+(num*i));
			i++;
		}while(i<=10);
	}
	
	
	int[] arithematic(int a, int b) {
		int arr[]= new int[1];
		arr[0]=a+b;
		return arr;
	}
	
	public static void main(String[] args) {
		arrayElement obj = new arrayElement();
		obj.forLoop();
		int arr[]= {10, 20};
		obj.forEachLoop(arr);
		obj.doWhileLoop(5);
		
		int arr1[]=obj.arithematic(5, 6);
		System.out.println("Result: "+arr1[0]);
	}

}
