package Review_2;

public class RR_Final_Var {
	
	final int a=500;
	public void sample()
	
	{
	a=560;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		RR_Final_Var obj=new RR_Final_Var();
		obj.sample();

	}

}
