package constructors;

public class Constructors1 {
	void m1(){
		System.out.println("m1 method");
	}
	/*Constructors1(){
		//this is the default constructor which will be created by the compiler.user can create or no need to create
		//empty implimentations
	}*/
	

	public static void main(String[] args) {
		Constructors1 c=new Constructors1();
		c.m1();

	}

}
//if a class does not contain constructor then compiler ill generate zero argument constructor which is called default constructor.
//Test t=new Test()->during compilation compiler will check for the Test() constructor.if it is not present then complier will create the default constructor then that will be executed at the run time(jvm will not create the constructor))
//cons name and class name must be same.
//cons able to take params.
//cons not alowed return types.
//two types of constructors:
//default:(0 argms with empty implementions)
//user defined constructors:(as per requirement user will use either 0 arg or paramatraised constructors)