package Review_2;

public class RR_Interfac_Class2 implements RR_Interfc1,RR_Interfc2 {
	
	public void show() {
		System.out.println("this is the definition of interface 1 method");
	}

	public void display() {
		System.out.println("this is the definition of interface 2 method");
	}
	public static void main(String[] args) {
		
		RR_Interfac_Class2 obj=new RR_Interfac_Class2();
		obj.show();
		obj.display();
		//obj.sample();

	}

}
