package methodsinjava;

public class Method6 {
	
	int add(){
		return 10;
	}
	String m2(){
		return "kousalya";
	}
	float m3(){
		return 10.8f;
	}
	static char m4(){
		return 'k';
	}

	public static void main(String[] args) {
		
		Method6 m=new Method6();
		//int a=m.add();
		System.out.println(m.add());
		String s=m.m2();
		System.out.println(s);
		float f=m.m3();
		System.out.println(f);
		char c=m.m4();
		System.out.println(c);
	}

}
//if the method return type is object ,then create the object theen return that value.
