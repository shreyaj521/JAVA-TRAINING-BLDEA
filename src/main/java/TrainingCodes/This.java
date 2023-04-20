package TrainingCodes;
class Dog2{
	private String name;
	private String color;
	private int cost;
	
	void setData (String name, String color, int cost) {
		this.name=name;
		this.color = color;
		this.cost = cost ;
		
	}
void getData() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(cost);
}
}
public class This {
	public static void main(String[] args) {
Dog2 d1= new Dog2();
		
		d1.setData("Blacky","Black" ,5000 );
		d1.getData();
	
	}

}
