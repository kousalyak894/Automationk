package constructors;

public class Constructor4 {
	
	Constructor4(){
		this(10);
		//this("kous","alya"); this will not allow
		System.out.println("0 arg constructor");
	}
	Constructor4(int a){
		this("kous","alya");
		System.out.println("a value is:"+a);
	}
	Constructor4(String a,String b){
		System.out.println("a and b strings are:"+a+","+b);
	}
	public static void main(String[] args) {
		//named approach
		Constructor4 c=new Constructor4();
		
		/*Constructor4 c1=new Constructor4(10);
		Constructor4 c2=new Constructor4("kous","alya");*/
		
		//nameless approach
		/*new Constructor4();
		new Constructor4(10);
		new Constructor4("kous","alya");*/
		
		
		

	}

}
//we can call the constructor by using this keyword.
//we can execute one consructor in another constructor in the same class will use this keyword.
//constructor calling this keyword must be first statement in the constructor.
//one constructor will able to call only one constructor.more than one will not be allowed
//but one method can call many methods
//format of obj creation:named approach and nameless approach.
//constructors will be called at the time of object creation.so no need to name that object.we wont utilise that name for calling that constructor.



//overview:
//after new keyword in the object creation is called constructor part.Constructor will be ececute during the object creation.
//rules:const and cls name must be same.const does not contain return type.const able to take parameters.