package staticblocks;

public class Staticblock1 {
	static int a;
	static{
		a=10;//static blocks are used to initialise static variables.
	}
	static void disp(){
		System.out.println(Staticblock1.a);
	}

	public static void main(String[] args) {
		Staticblock1.disp();

	}

}
//static blocks are used to initialise static variables.
