package TrainingCodes;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number of students");
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<n;i++) {
	System.out.println("Enter the marks of students"+ (i+1));
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	System.out.println("Enter the marks of students "+ (i+1)+" is "+arr[i]);


	}

}
}