package Review_2;

public class RR_Exception_Arry {

	public static void main(String[] args) {
	try
	{
		int arr[]= {1,2,3,4,5,6};
		System.out.println(arr[13]);
	}
catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(e);
	System.out.println("exception handled");

	}
	int a=10,b=15;
	int c=a+b;
	System.out.println(c);
	
	}

}
