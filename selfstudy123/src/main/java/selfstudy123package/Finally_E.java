package selfstudy123package;

public class Finally_E {

	public static void main(String[] args) {
		
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
		finally
		{
			System.out.println("print always");
		}


	}

}
