package selfstudy123package;

public class Poly_Overload_SS {
	public void sample(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sample(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_Overload_SS obj=new Poly_Overload_SS();
		obj.sample(10,20);
		obj.sample(10,20,30);
	}

}
