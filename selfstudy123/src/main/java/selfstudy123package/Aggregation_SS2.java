package selfstudy123package;

public class Aggregation_SS2 {
	
	String name;
	int age;
	Aggregation_SS1 address;
	Aggregation_SS2(String name,int age,Aggregation_SS1 address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	public void display()
	{
		System.out.println(name+" "+age);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation_SS1 add=new Aggregation_SS1("kumily","kerale","India");
		Aggregation_SS1 add1=new Aggregation_SS1("pampady","kerala","India");
		Aggregation_SS2 obj=new Aggregation_SS2("anju",30,add);
		Aggregation_SS2 obj1=new Aggregation_SS2("alex",35,add1);
		obj.display();
		obj1.display();
	}

}
