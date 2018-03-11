package variablesinjava;

public class Variable3 {
	
	/*static int a=10;
	static int b=20;

	public static void main(String[] args) {
		System.out.println(a);//can call directly
		System.out.println(Variable3.a);//can call by using class name
		Variable3 v=new Variable3();
		System.out.println(v.b);//can call by using object
}*/
	
	/*int a,b;
	public static void main(String[] args){
		 Variable3 v1=new  Variable3();
		System.out.println( v1.a);
		
	}*/                //if we wont initialise instance variables jvm will provide us the default value.
	
	/*static int a,b;
	public static void main(String[] args){
		
		System.out.println( Variable3.a);
	}*/                 //if we wont initialise static variables jvm will provide us the default value.
	
	 
	/*public static void main(String[] args){
		int a,b;
		System.out.println(a);
		System.out.println(b);} */ // if we wont initialise local variables jvm will throw an error .          

}
//static variable accessing:can be accessed directly,by using class name,by using object.
//for the instance variables,jvm will assign default values.
//for the static variables also,jvm will assign default values.
//fir the local variable,jvm will not provide default values.will get the error msg to assign the variables.
