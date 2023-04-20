package TrainingCodes;
import java.util.*;

public class Anagramcode {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("String 1");
		String s1= sc.next();
		System.out.println("String 2");
		String s2= sc.next();
		
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		
	
		Arrays.sort(c1);
		Arrays.sort(c2);

	if(Arrays.equals(c1, c2)) {
	System.out.println("Anagrams");
	
	
	}
	else {
		System.out.println("Not Anagrams");
	}
}
}