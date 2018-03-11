package constructors;

public class Paramconst {
	void m1(){
		System.out.println("m1 method");
	}
	Paramconst(){//user def 
		System.out.println("0 arg");
	}
    Paramconst(int a){
		System.out.println("1 arg");
	}

	public static void main(String[] args) {
		Paramconst cons=new Paramconst();//this will be executed only when class does not contain user defined constructor.other wise will get the compilation error.
		Paramconst cons1=new Paramconst(5);
        cons.m1();
        cons1.m1();
	}

}
//In a class if there is no atleast one constructor then default constructor will be generated.
//If there is atleast one constructor then default constructor will not generate.if we try to execute default constructor without creating a constructor compilation error will be occured.
//constructor will be executed during object creation itself.
