package selfstudy123package;

public class Super_Variable_SS2 extends Super_Varible_SS{

	int a=80;
	public void show() {
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Super_Variable_SS2 obj=new Super_Variable_SS2();
		obj.show();
	}

}
