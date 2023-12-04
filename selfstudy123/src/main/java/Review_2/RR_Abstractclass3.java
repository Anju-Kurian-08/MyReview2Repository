package Review_2;

public class RR_Abstractclass3 extends RR_Abstactclass2{
	
	public void show() {
		System.out.println("this is my method in normal class");
	}
	
	public void display() {
		System.out.println("this is my method in abstract class1");
	}

	
	public void sample() {
		System.out.println("this is my method in abstract class2");
	}
	public static void main(String[] args) {
		
		
		RR_Abstractclass3 obj=new RR_Abstractclass3();
		obj.show();
		obj.sample();
		obj.display();
		obj.sample1();
		obj.display1();
		
	}

}
