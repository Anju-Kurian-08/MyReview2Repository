package selfstudy321;

public class Poly_Override2 extends Poly_override {

	

	public void display()
	{
	int a=40,b=50;
	int c=a+b;
	System.out.println(c);
	System.out.println(super.d);
	super.display();
	
	}
	public static void main(String[] args) {
		
		Poly_Override2 obj=new Poly_Override2();
		obj.display();
		//Poly_override obj1=new Poly_override();
		//obj1.display();
	}

}
