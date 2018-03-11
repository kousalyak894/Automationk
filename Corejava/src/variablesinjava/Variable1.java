package variablesinjava;

public class Variable1 {
	/*void m1(){  //local variables memory will be allocated when method starts.
		int a=10;
		System.out.println(a);
	}//local variables memory will be released when method completed.so another method can be used this memory also.
	void m2(){
		System.out.println(a);  //scope of local variable is within the blocks.
	}*/
	
	//instance variable
	int a=100;
	int b=200;
	//static method
	   public static void main(String[] args) {
		   //static area
		     Variable1 v=new Variable1();
		     System.out.println(v.a);  //variable is the class variable but we are accessing in the static area .so, we need to create an object.
		}
	   //instance method
	   void test1(){
		   //instance area
		   System.out.println(a);//so variable is instance,and method is also instance .so we can access directly that variable.no need to create an object.
	   }

}
//variables are used to store values.by using this values we are achieving project requirement.
//three types of variables:local,instance,static
//int a=10; this the variable of int type.
//variable type may be -->primitive type,enum type,class type.
//local variables:
//variables which are declared inside the method or constructor or inside blocks are local variables.
//scope of local variable is within the blocks or method or constructor.
//local variables memory will be allocated when method starts.local variables memory will be released when method completed.so another method can be used this memory also.
//loacl variables are stored in stack memory.
//instance variables:
//declared inside the class but outside of the methods.
//scope of variables--->inside the class,all methods,constructors,blocks.
//instance variables memory is loaded when object is created.memory destroyed when object is destroyed.
//instance variables stored in heap memory.
//if the variable located in same area then that can be accessed directly.if it is in diff area that can be accessed by using an object.

