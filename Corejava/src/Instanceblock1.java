
public class Instanceblock1 {
	int eid;
	
	//instance block initializing value to variable during object creation
	{
		eid=10;
	}
	void display(){
		System.out.println(eid);
	}

	public static void main(String[] args) {
		new Instanceblock1().display();

	}

}
//memory allocated when we create the object.
