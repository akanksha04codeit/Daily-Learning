import java.util.Arrays;

public class TwoD {
	
	void multiDim() {
		String[][] names= {
				{"Mr","Mrs","Miss"},
				{"Danish","Shukla","Patil"}
		};
		
		System.out.println(names[0][0]+" "+names[1][0]);
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;i<names[i].length;j++) {
				System.out.println("Index["+i+"]["+j+"]="+names[i][j]);
			}
		}
	}
	
	void arrayManipulation() {
		int[] arr1= {5,8,9,88,4,3};
		int[] arr2= {88, 66, 92, 82, 32};
		
		System.out.println("To String "+Arrays.toString(arr1));
		System.out.println("into list "+Arrays.asList(arr1));
		
		int key = 82;
		 Arrays.binarySearch(arr2,key);
		System.out.println("");
	}

	public static void main(String[] args) {
		
        TwoD obj = new TwoD();
        obj.multiDim();
       // obj.arrayManipulation();
	}

}

