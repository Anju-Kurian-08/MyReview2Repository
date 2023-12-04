package selfstudy123package;

public class Cls_EE5 extends  Cls_EE4{

	
	public void sample() {
		System.out.println("this is my abstract method in interface 1");
	}
	
	public void show() {
		System.out.println("this is my abstract method in interface 2");
}
	
	public void display() {
		System.out.println("this is my abstract method in abstract clas");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls_EE5 obj=new Cls_EE5();
		obj.sample();
		obj.show();
		obj.normal();
		obj.display1();
		obj.display();
		
	}

}
