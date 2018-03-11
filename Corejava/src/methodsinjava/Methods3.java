package methodsinjava;

public class Methods3 {
	
	void add(int a,int b){
		System.out.println(a+b);
	}
	void sub(int a,int b){
		System.out.println(b-a);
	}
	void mul(int a,int b){
		System.out.println(a*b);
	}
	static void mul1(int a,int b){
			System.out.println(a*b);	
	}
	void div(int a,int b){
		add(20, 30);//instance method calling.we can call the methods in another methods also.
		sub(20,40);
		mul(2,3);
		mul1(3,4);
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		 Methods3 m=new  Methods3();
		  m.div(10, 2);

	}

}
//two methods with same signature is not allowed.but diff signature is allowed.
//return type is mandetory for methods.
//java support inner classes but does not support inner methods.
//
