package selfstudy123package;

public class Hierarchical_Inheritance_Child2SS extends Hierarchical_Inheritance_SS{
	public void sample2() {
		System.out.println("this is my child2-Hierarchical inheritace");
	}

	public static void main(String[] args) {
	
		Hierarchical_Inheritance_Child2SS obj=new Hierarchical_Inheritance_Child2SS();
		obj.sample2();
		obj.sample();
		Hierarchical_Inheritance_Child1SS obj1=new Hierarchical_Inheritance_Child1SS();
		obj1.sample1();
		obj.sample();

	}

}
