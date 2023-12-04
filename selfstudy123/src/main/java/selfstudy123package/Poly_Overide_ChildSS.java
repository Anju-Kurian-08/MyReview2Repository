package selfstudy123package;

public class Poly_Overide_ChildSS extends Poly_Override_ParentSS{

	public void display() {
		System.out.println("this is my child class_override");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_Overide_ChildSS obj=new Poly_Overide_ChildSS();
		obj.display();
		Poly_Override_ParentSS obj1=new Poly_Override_ParentSS();
		obj1.display();
	}

}
