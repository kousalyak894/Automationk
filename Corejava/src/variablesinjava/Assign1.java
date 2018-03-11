package variablesinjava;

public class Assign1 {
	
	 int x=200;
	 int y=300;
	
	static void test1(){
		Assign1 v=new Assign1();//we can create objects in any method.
		System.out.println( v.x);
		System.out.println(v.y);
	}//when ever the method is completed object is destroyed.so we have to create object again if we want to access variables in another methods. 
	
	static void test2(){
		Assign1 v1=new Assign1();
		System.out.println(v1.x);
		System.out.println(v1.y);
	}

	public static void main(String[] args) {
		   
		/*Assign1 v2=new Assign1();
		v2.test1();
		v2.test2();*/             //we can call static methods by creating an object.
		
		/*Assign1.test1();
		Assign1.test2();*/        //we can call static method by using class name.
		
		test1();
		test2();                  //we can call static methods directly
		
		
		
		
	}

}
