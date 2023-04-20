package TrainingCodes;
import java.util.*;
public class Vowelsex1 {
	static Scanner sc = new Scanner(System.in);
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("Enter a string: ");
			String str = sc.nextLine();
			str= str.toLowerCase();
		
	 
			for (int i = 0; i < str.length(); i++)
			{
				char c = str.charAt(i);
				if ( (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
				{
					String front = str.substring(0, i);
					String back = str.substring(i + 1);
					str = front + "@" + back;
				}
			}
			
			System.out.println(str);
		}
	 
	}

	








 
	