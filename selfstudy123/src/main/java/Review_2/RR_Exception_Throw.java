package Review_2;

public class RR_Exception_Throw {
	
	public void display() {
		
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("ineligible to vote");
		}
		
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		RR_Exception_Throw obj=new RR_Exception_Throw();
		obj.display();

	}

}
