package selfstudy123package;

public class Throw_Exception {

	public void show()
	{
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("not eligile");
			
		}
		else
		{
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw_Exception  obj=new Throw_Exception();
		obj.show();
	}

}
