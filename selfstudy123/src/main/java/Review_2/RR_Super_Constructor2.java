package Review_2;

public class RR_Super_Constructor2 extends RR_Super_Constructor
{
	
	RR_Super_Constructor2(String a,int b)
	{
		
		super("anju");
		System.out.println("My name is "+a+" "+"My age is "+b);
	}

	public static void main(String[] args) {
		
		RR_Super_Constructor2 obj=new RR_Super_Constructor2("alex",35);
		//RR_Super_Constructor obj1=new RR_Super_Constructor("anju");
		
	}

}
