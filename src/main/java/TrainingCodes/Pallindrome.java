package TrainingCodes;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str1= sc.next();
		String str2= "";
		
		for (int i=str1.length()-1; i>=0;i--) {
			str2= str2+str1.charAt(i);
			
		}
		if(str1.equals(str2)==true) {
			System.out.println("Pallindrome");
			
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
