package Review_2;

public class RR_Super_Var2 extends RR_Super_Var {
	
	public void display() {
		int a=870;
		System.out.println(a);
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		
		RR_Super_Var2 obj=new RR_Super_Var2();
		obj.display();
	}

}
