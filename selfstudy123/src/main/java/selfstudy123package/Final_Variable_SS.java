package selfstudy123package;

public class Final_Variable_SS {
	final int a=50;
	public void display() {
		a=90;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Variable_SS obj=new Final_Variable_SS();
		obj.display();
	}

}
