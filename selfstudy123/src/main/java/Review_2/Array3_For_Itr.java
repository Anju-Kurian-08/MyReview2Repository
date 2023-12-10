package Review_2;
import java.util.ArrayList;

import java.util.*;

public class Array3_For_Itr {

	public static void main(String[] args) {
	ArrayList<Integer>obj=new ArrayList<Integer>(); //generic
	ArrayList obj1=new ArrayList(); //non generic
	
	obj.add(32);
	obj.add(22);
	obj.add(42);
	obj.add(52);
	obj.add(392);
	for(int a:obj)
	{
		System.out.println(a);
	}

	obj1.add(2);
	obj1.add(3.5f);
	obj1.add("anju");
	obj1.add(5);
	obj1.add(92);
	Iterator itr=obj1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
