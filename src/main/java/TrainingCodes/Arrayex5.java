package TrainingCodes;

import java.util.Arrays;

public class Arrayex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,90,30,50,45,70,};
		int arr2[]= {70,10,50,100,45,90,30};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 if(arr1.length==arr2.length) {
			 for(int i=0;i<arr1.length;i++) {
				 if(arr1[i]!=arr2[i]) {
					 System.out.println("Aarrays are not Equal");
					 System.exit(0);
					 
				 }
			 }
		  
			 System.out.println("Arrays are equal");
		 }
		 else {
			 System.out.println("Aarrays are not Equal");
		 }
		

		
		

	}

}
