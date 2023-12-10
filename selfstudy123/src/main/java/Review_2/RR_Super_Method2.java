package Review_2;

public class RR_Super_Method2 extends RR_Super_Method{
	
	public void sample() {
		System.out.println("this is my method 2");
		super.sample();
		
	}

	public static void main(String[] args) {
		
		
		RR_Super_Method2 obj=new RR_Super_Method2();
		obj.sample();
	}

}
