package Review_2;

public class RR_Multilevel_Child extends RR_Multilvel_Parent2{
	
	public void display() {
		System.out.println("this is my child class");
	}

	public static void main(String[] args) {
		
		
		RR_Multilevel_Child obj=new RR_Multilevel_Child();
		obj.display();
		obj.show();
		obj.sample();
		
	}

}
