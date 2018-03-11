package constructors;

public class Constructor2 {
	
	int eid;
	String ename;
	float avg;
	Constructor2(){//user defined constructor
		//constructors are used to initialise values for the instance variables during object creation.
		eid=38;
		ename="kousalya";
		avg=35.67f;
		//if we wont initialise default values will be executed.
	}
	void dis(){
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
		System.out.println("employee avg marks:"+avg);
		
	}

	public static void main(String[] args) {
		Constructor2 c=new Constructor2();
		c.dis();
		Constructor2 c1=new Constructor2();
		c1.dis();
		
		

	}

}

//constructors are used to write the business logics of the appliaction.THose logics are executed during object execution.
//purpose:constructors are used to initialize some values to instance variables during object creation.
//pblm with 0 arg constructor:if we create diff objects for constructor same values will be executed every time.
//so to overcome this paramatrized constructor will be used.