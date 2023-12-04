package selfstudy123package;

public class NullPoint_Exception {
	
	public void show() {
		try
		{
		String a=null;
		System.out.println(a.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	
	}

	public static void main(String[] args) {
		NullPoint_Exception obj=new NullPoint_Exception();
		obj.show();

	}

}
