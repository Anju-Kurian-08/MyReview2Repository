package selfstudy123package;

public class Num_Format_Excep {
	

	public static void main(String[] args) {
	try
	{
		
		String a="anju";
		int  s=Integer.parseInt(a);
	}
catch(NumberFormatException e)
	{
	System.out.println(e);
	System.out.println("exception handled");
	}
	}

}
