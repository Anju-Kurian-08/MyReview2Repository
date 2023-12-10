package selfstudy321;

public class Final_Var1 {
	
	int a=35;
	public void display() {
		a=56;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Final_Var1 obj=new Final_Var1();
		obj.display();
	}

}
