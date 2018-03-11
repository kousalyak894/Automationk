package methodsinjava;

public class Method9 {
	int a=100;
	int b=200;
	void val(){
		System.out.println(value(a));//we can print the global variables in another method
		System.out.println(add(a,b));
	}
	
	int value(int a){
		return this.a;
	}
	
	int add(int a,int b){
		return a+b;
	}
	
	String str(String a,String b){
		return a+" "+b;
	}

	public static void main(String[] args) {
		
		Method9 m=new Method9();
		/*int i=m.value(10);
		System.out.println(i);
		
		int i1=m.add(10, 20);
		System.out.println(i1);
		
		String s1=m.str("kousalya", "koushi");
		System.out.println(s1);*/
		
		System.out.println(m.add(10, 20));
		m.val();
		
	
	}

}
