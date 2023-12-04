package selfstudy123package;

public class ArrayIndex_Exception {
	
	public void display() 
	{
	try
	{
		int arr[]= {1,2,3,4};
		System.out.println(arr[10]);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("exception handdled");
	}
		
	}

	public static void main(String[] args) {
	
		ArrayIndex_Exception obj=new ArrayIndex_Exception();
		obj.display();
	}

}
