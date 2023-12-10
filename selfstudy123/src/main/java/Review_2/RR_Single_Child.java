package Review_2;

public class RR_Single_Child extends RR_Single_Parent {
	
	public void show() {
		System.out.println("this is my child class");
	}

	public static void main(String[] args) {
	
		RR_Single_Child obj=new RR_Single_Child();
		obj.show();
		obj.sample();
	}

}
