package Review_2;
import java.util.LinkedList;

public class RR_Collection_Linkd {

	public static void main(String[] args) {
		
		LinkedList<Integer>obj=new LinkedList<Integer>();
		
		obj.add(90);
		obj.add(190);
		obj.add(290);
		obj.add(390);
		obj.add(490);
		obj.add(590);
		//obj.add(3,80);
		obj.remove(3);
		obj.addFirst(10000);
		obj.addLast(7000);
		//obj.removeFirst();
		obj.removeLast();
		System.out.println(obj.contains(10000));
		System.out.println(obj.indexOf(10000));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj.size());
		//obj.clear();
	
		//obj.addAll(obj);
		//obj.addAll(3, obj);
		System.out.println(obj);
		

		LinkedList obj1=new LinkedList();
		obj1.add(23.5f);
		obj1.add(23);
		obj1.add(3.5f);
		
		obj1.add("anju");
		obj1.add(.5f);
		obj1.add(235);
		
		System.out.println(obj1);

	}

}
