package variablesinjava;

public class Variable4 {
	
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		Variable4 v4=new Variable4();
		System.out.println(v4.a);
		System.out.println(v4.b);
		v4.a=999;
		v4.b=888;
		System.out.println(v4.a);
		System.out.println(v4.b);
		
		Variable4 v=new Variable4();
		System.out.println(v.a);//here 10 will be printed because every time while creating an object one copy will be created.so same value will be printed.
		System.out.println(v.b);//here 888 will be printed .because for an static variable only one copy will be created and each and every time when value changes that will be overriden.
		
		
		v4.a=666;
		v4.b=777;
		Variable4 vv=new Variable4();
		System.out.println(vv.a);
		System.out.println(vv.b);
		
		
		
		
		
		

	}

}
//class vs object
//class is the logical entity .It contains logics of the application.
//object is the physical entity representing memory.
//class is the blue print which decides the object creation.without class there is no way to create an object.
//in single class we can create multiple objects.but for every object it creates the memory.
//create the class by using class keyword and declare the class by using new keyword.
//for instance variables->every object creation one copy will be created.means every time memory will be created.
//for static variable->per class only one copy will be created irrespective of every object creation.this memory will be override every time.