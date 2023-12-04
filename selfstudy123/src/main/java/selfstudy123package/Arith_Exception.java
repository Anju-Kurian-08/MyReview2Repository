package selfstudy123package;

public class Arith_Exception {
	
	public void sample() {
		try
		{
			int a=9/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		Arith_Exception obj=new Arith_Exception();
		obj.sample();

	}

}
