package Review_2;

import java.util.ArrayList;
import java.util.Iterator;


public class RR_Collectn_Array {

	public static void main(String[] args) {
	ArrayList<Integer>obj=new ArrayList<Integer>();
	ArrayList obj1=new ArrayList();
	
	obj.add(12);
	obj.add(13);
	obj.add(14);
	//obj.addAll(obj);
	//obj.remove(3);
	//obj.clear();
	//System.out.println(obj.contains(14));
	//System.out.println(obj.indexOf(12));
	
	for(int a:obj)// can be used with generic only
	{
		System.out.println(a);
	}
	//System.out.println(obj);
	
	obj1.add(13.5f);
	obj1.add(14);
	obj1.add("anju");
	Iterator itr=obj1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//obj1.addAll(2,obj1);
	//System.out.println(obj1);
	


	}

}
