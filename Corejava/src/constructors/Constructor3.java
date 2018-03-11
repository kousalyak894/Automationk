package constructors;

public class Constructor3 {
	int empid;
	String empname;
	float avgmarks;
	
	Constructor3(int empid,	String empname,float avgmarks){
		this.empid=empid;
		this.empname=empname;
		this.avgmarks=avgmarks;
		
	}
	void display(){//methods are used to write the logics of the application.
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
		System.out.println("employee avg marks:"+avgmarks);
	}

	public static void main(String[] args) {
		Constructor3 c=new Constructor3(10,"kousalya",50.9f);
		c.display();
		Constructor3 c1=new Constructor3(11,"kousalya",51.9f);
		c1.display();
		

	}

}
//
