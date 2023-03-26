package TrainingCodes;

public class Stringexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "RajaRamMohanRoy";
System.out.println(str.length());
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
System.out.println(str.charAt(1));
int a= 20+ str.charAt(1);
System.out.println(a);
System.out.println(str.indexOf('R'));
System.out.println(str.indexOf('Z')); 
System.out.println(str.startsWith("Raja"));
System.out.println(str.startsWith("Roa"));
System.out.println(str.endsWith("Roy"));
System.out.println(str.endsWith("boy"));
System.out.println(str.contains("Mohan"));
System.out.println(str.contains("ohan"));	
	}
	

}
