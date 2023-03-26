package TrainingCodes;
import java.util.Scanner;
public class Arrayex4 {

	public static int LinearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return(i+1);
			}
		
	}return 0;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the array element tobe searched");
		int key= sc.nextInt();
		int arr[]= {10, 20, 30, 40, 50};
		int res= LinearSearch(arr,key);
		if(res>0) {
			System.out.println("Element foud in pos"+(res));
		}
		else {
			System.out.println("ele not found");
		}
		
		// TODO Auto-generated method stub
		

	}

}
