package Review_2;

import java.util.ArrayList;
import java.util.*;

public class Itrtr_Class {

	public static void main(String[] args) {
	ArrayList<Integer> obj=new ArrayList<Integer>();
	
obj.add(12);
obj.add(13);
obj.add(14);
Iterator<Integer> itr=obj.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
