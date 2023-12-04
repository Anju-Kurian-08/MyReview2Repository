package Review_2;

public class RR_Exception_Null {

	public static void main(String[] args) {

		
		try
		{
				String s=null;
				System.out.println(s.length());
		}
        catch(NullPointerException e)
		{
        	System.out.println(e);
        	System.out.println("exception handled");
		}
        
	}

}
