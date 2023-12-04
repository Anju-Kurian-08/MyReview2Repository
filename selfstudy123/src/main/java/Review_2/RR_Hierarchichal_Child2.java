package Review_2;

public class RR_Hierarchichal_Child2 extends RR_Hierarchichal_Parent{
	
	
	public void display() {
		System.out.println("this is my child class2");
	}

	public static void main(String[] args) {
	
		
		RR_Hierarchichal_Child2 obj=new RR_Hierarchichal_Child2();
		obj.display();
		obj.show();
		RR_Hierarchichal_Child1 obj1=new RR_Hierarchichal_Child1();
		obj1.sample();
		obj.show();
		
	}

}
