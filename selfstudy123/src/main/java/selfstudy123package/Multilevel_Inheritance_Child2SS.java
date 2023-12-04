package selfstudy123package;

public class Multilevel_Inheritance_Child2SS extends Multilevel_Inheritance_Child1SS{

	public void show2() {
		System.out.println("this is my child2-multi;evel inheritance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_Inheritance_Child2SS obj=new Multilevel_Inheritance_Child2SS();
		obj.show();
		obj.show1();
		obj.show2();
	}

}
