package Review_2;

public class RR_Poly_Override2 extends RR_Poly_Override{
	
	public void sample(int y,int z)
	{
		int x=y+z;
		System.out.println("Sum of numbers is "+x);
	}


	public static void main(String[] args) {
	
		RR_Poly_Override2 obj=new RR_Poly_Override2();
		obj.sample(60,50);
		RR_Poly_Override obj1=new RR_Poly_Override();
		obj1.sample(30,10);
	}

}
