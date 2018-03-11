package staticblocks;

public class StaticA {
	static{
		System.out.println("static block");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("StaticB");//if class does not contain then will get class not fount exception.
		Class.forName("StaticC");
		
		

	}

}
//we cant execute static block without main.Iam creating staticB and StaticC classes without main.how to execute?
//by using forname method,we can load the B and C class methods dynamically into memory at runtime
//forname is the static method present in class(class name itself is a class)
