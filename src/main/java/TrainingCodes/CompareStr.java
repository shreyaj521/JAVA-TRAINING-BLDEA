package TrainingCodes;
import java.util.Scanner;
public class CompareStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter thr string 1");
String str1= sc.next();
System.out.println("Enter thr string 2");
String str2= sc.next();

if (str1.equalsIgnoreCase(str2)== true) {
	System.out.println("Strings are Equal");
	
}else {
	System.out.println("Strings  not Equal");
}
	
	}

}
