package selfstudy123package;

public class Abstraction_SS3 extends Abstraction_SS2{
	
	public void display()
	{
		System.out.println("this is my abstract method from class one");
	}
	
	public void sample() {
		System.out.println("this is my abstract method from class two");
	}

	public static void main(String[] args) {
	
		
		Abstraction_SS3 obj=new Abstraction_SS3();
		obj.display();
		obj.sample();
		obj.sample2();
		obj.display1();
		
	}

}
