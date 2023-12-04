package Review_2;

public class RR_Exception_Arith {
	
	public void display() {
		try
		{
			int a=10/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");
		}
		
	}
	

	public static void main(String[] args) {
	
		RR_Exception_Arith obj=new RR_Exception_Arith();
		obj.display();

	}

}
