package Review_2;

public class RR_Poly_Overload {
	
	
	public int sample(int a,int b)
	{
		int c=a+b;
		return c;
	}
   
	
	public void sample(int a,String b)
	{
		System.out.println("name is "+b+"  age is "+a);
	}
	
	
	public String sample(String address)
	{
		return address;
	}
	
	public float sample(int a,float b)
	{
		float c=a+b;
		return c;

	}
	public static void main(String[] args) {
		
		
		RR_Poly_Overload obj=new RR_Poly_Overload();
		System.out.println("sum of numbers is "+obj.sample(10, 15));
		obj.sample(30, "anju");
		System.out.println("my address is "+obj.sample("vlklyil"));
		System.out.println("sum of numbers is "+obj.sample(30, 40.5f));
	

	}

}
