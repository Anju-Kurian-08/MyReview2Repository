package Review_2;

public class RR_Aggregation2 {
	
	
	String name;
	int age;
	RR_Aggregtion constr;
	RR_Aggregation2(String name,int age,RR_Aggregtion constr)
	{
		this.name=name;
		this.age=age;
		this.constr=constr;
	}
	
	public void display() {
		System.out.println("city is "+constr.city+" state is "+constr.state+" country is "+constr.country);
		System.out.println("name is "+name+" age is "+age);
	}

	public static void main(String[] args) {
		
		RR_Aggregtion con1=new RR_Aggregtion("kumily","kerala","India");
		RR_Aggregtion con2=new RR_Aggregtion("pampady","kerala","India");
		RR_Aggregation2 con3=new RR_Aggregation2("anju",30,con1);//we have to acquire firstclass by using second class
		RR_Aggregation2 con4=new RR_Aggregation2("alex",35,con2);
		
		con3.display();
		con4.display();
		
	}

}
