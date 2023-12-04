package Review_2;

public class RR_Exception_Multiple {

	public static void main(String[] args) {
  try
  {
	  int arr[]= {1,2,3,4,5};
	  System.out.println(arr[10]);
  }

  catch(ArithmeticException e)
  {
	  System.out.println(e);
	  System.out.println("exception handled");
  }
  catch(NullPointerException e)
  {
	  System.out.println(e);
	  System.out.println("exception handled");
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
	  System.out.println(e);
	  System.out.println("exception handled");
  }
  catch(NumberFormatException e)
  {
	  System.out.println(e);
	  System.out.println("exception handled");
  }
  
	}

}
