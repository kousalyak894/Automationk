package methodsinjava;
class X{}
class Emp{}
class Y{}
class Student{}

public class Method2 {
	void m1(X x,Emp e){       //this X and Emp classes will present in there other modules of the application.may be a chance
		System.out.println("m1 method");
	}
	static void m2(Y y,Student s){
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		 Method2 m=new  Method2();
		 //if we call m1 method ,we have to pass values for that arguments.the paramaters are objects .so,we have to create object of that class,then reference var will be passed.
		 X x1=new X();
		 Emp e1=new Emp();
		 m.m1(x1,e1);//m.m1(new X(),new Emp());
		 
		 Y y1=new Y();
		 Student s1=new Student();
		 m.m2(y1,s1);//m.m2(new Y(),new Student());
		 
		

	}

}
//in real time,methods will expect objects not premitives.
//
