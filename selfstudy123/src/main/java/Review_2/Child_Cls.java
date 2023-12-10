package Review_2;

public class Child_Cls implements Intrfc_Rev1,Intrfc_Rev2{
	
	public void show() {
		System.out.println("hello");
	}
	
	public void sample() {
		System.out.println("hellowolrd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Cls obj=new Child_Cls();
		obj.show();
		obj.sample();
	}

}
