package Review_2;

public class RR_Exception_Number {

	public static void main(String[] args) {
		try
		{
			String s="anju";
			int a=Integer.parseInt(s);
			//System.out.println(a);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}

	}

}
