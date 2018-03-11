package methodsinjava;

public class Method1 {
	int a=10;
	//System.out.println(a);  inside class we can't write the business logics directly .so we will create the method to write the logics inside it.
	
	public void add(int a,int b){//local variables
		System.out.println(a+b);
	}
	static void method1(String a,String b){
		System.out.println(a+" ,"+b);
	}

	public static void main(String[] args) {
		
		Method1.method1("kkk","nnn");
		Method1 m=new Method1();
		m.add(10, 20);

	}

}
//Inside the class we cant write the business logics directly.so will create the method to write the logics inside.
//so methods are used to write the logics of the application.
//2 methods:instance and static methods.methods are used to write the logics only.
//instance mthd->memory will be allocated during object creation.so,access instance method by using object(access permission)
//static mthd->memory will be allocated while class is loading.so,access static method by using class name.

//methods:
//syntax:modifier_list ReturnType Methodname(paramater_list) throws Exception.
//eg:public void add(int a, int b):here my functionalty is add.this add will execute when ever we are passing inputs a,b values.and after that it wont return an value as it is void. and pubic is the permission .
//eg:India Idcard DL(id1,id2,id3):here my functionality is driving licence this will be processed when we submit the ids then,they will return the id card, which will have permision that we can use it in India
//method signature:method_name(paramaters)->method name with corresponding paramaters is called method signature.