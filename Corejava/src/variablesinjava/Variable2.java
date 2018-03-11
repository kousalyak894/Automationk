package variablesinjava;

public class Variable2 {
	static int a=10;
	static int b=20;
	
	void test1(){
		System.out.println(Variable2.a);
	}
	
	static void test2(){
		System.out.println(Variable2.b);
	}
	

	public static void main(String[] args) {
		//static variable and static method can be called directly.
		System.out.println(b);
		test2();
		
		System.out.println(Variable2.b);
		//for calling the instance method in ststic area we need to create an object.so that we can able to access those methods by using the reference variable.
		Variable2 v=new Variable2();
		v.test1();
		
	}

}
//at execution time that is->java test
//jvm loads .class file byte code into memory,after that jvm will call main method to start execution.
//pgm execution starts from main method.jvm is responsible to execute all the statemnets present in the main method.
//every user defined methods should be called in main method.
//static variables:
//variables which are declared inside the class outside the method with static modifier is static variable.
//static variables memory will be allocated when the .class file is loading.
//scope->we can access within the class.
//static variables can access by using class name.it may be instance area or static area can access by using class name.
//static variables are stored in non heap memory.