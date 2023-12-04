package selfstudy321;

public class Poly_Overload {
	
	public void display(int a,String b)
	{
		System.out.println("name is "+b+"age is "+a);
	}
	
	public String display(int a,String b,int c)
	{
		return a+b+c;

	}

	public static void main(String[] args) {
		
		Poly_Overload obj=new Poly_Overload();
		obj.display(30,"anju");
		System.out.println(obj.display(1759," kumily ",30000));
		
	}

}
