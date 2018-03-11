package variablesinjava;

public class Assign2 {
	
	int a=10;
	int b=20;
	static int x=10;
	static int y=20;
	
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Assign2.x);
		System.out.println(Assign2.y);
		
	}
	static void m2(){
		Assign2 v3=new Assign2();                  //if we want to call static method or variable ,by using class name we can call
		System.out.println(x);                     //if we want to call instance method or variable in static method ,we should create an object .by using that object we can call.
		System.out.println(y);
		System.out.println(v3.a);
		System.out.println(v3.b);
	}

	public static void main(String[] args) {
		Assign2 v3=new Assign2();//we can create object with same name because object will be destroyed in that method itself.
		v3.m1();
		v3.m2();

	}

}
