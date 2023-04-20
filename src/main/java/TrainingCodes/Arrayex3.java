package TrainingCodes;

import java.util.Scanner;

public class Arrayex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of movie house");
		Scanner sc = new Scanner(System.in);
		int M= sc.nextInt();
		System.out.println("Enter the number of Theaters in each Movie house");
		int T= sc.nextInt();
		System.out.println("Enter the number of Screens in each Theaters");
		int S= sc.nextInt();
		
		int arr[][][]= new int[M][T][S];
		for(int i=0;i<M;i++) {
			System.out.println("indside movie house"+ (i+1));
			for(int j=0;j<T;j++) {
			System.out.println("indside movie Theater"+(j+1));
			for(int k=0; k<S; k++) {	
				System.out.println("capacity of each Screens in each Theater"+(k+1));
				
				arr[i][j][k]=sc.nextInt();
		}
		}
		}
		System.out.println("-----------------------");
		for(int i=0;i<M;i++) {
			System.out.println("indside movie house"+ (i+1));
			for(int j=0;j<T;j++) {
			System.out.println("indside movie Theater"+(j+1));
			for(int k=0; k<S; k++) {	
				System.out.println("The funds collected from each screen "+(k+1));
			int fund =350*arr[i][j][k];
			System.out.println(fund);

			}



	}

		}
	}
}
		
