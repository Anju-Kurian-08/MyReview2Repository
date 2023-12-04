package selfstudy123package;

public class Aggregation_2 {

	String name;
	int id;
	Aggregation_1 aggregation;
	Aggregation_2(String name,int id,Aggregation_1 aggregation)
	{
		this.name=name;
		this.id=id;
		this.aggregation=aggregation;
	}
	
	public void display()
	{
		System.out.println(aggregation.city+" "+aggregation.state+" "+aggregation.country);
		System.out.println(name+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation_1 aggregation1=new Aggregation_1("kumily","kerala","India");
		Aggregation_1 aggregation2=new Aggregation_1("pamapdy","kerala","India");
		Aggregation_2 agr=new Aggregation_2("anju",1759,aggregation1);
		Aggregation_2 agr1=new Aggregation_2("alex",1749,aggregation2);
		agr.display();
		agr1.display();
		
	}

}
