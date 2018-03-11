package methodsinjava;

public class Method5 {
	int m1(){
		System.out.println("Integer will print");
		return 10;
	}

	public static void main(String[] args) {
		
		Method5 m=new Method5();
		int i=m.m1();
		System.out.println(i);
		/*String s=m.m1();
		System.out.println(s);*/
	}

}
//In java return type of method is mandatory.it may be primitive type,class type,arrary type...
//and void returns nothing.
//if method returns anything other than void ,then it must return that type value by using return statement.
//inside the method the return stmt must be last statement of the method.means after completion of functionality. eg:if we apply DL,after complietion of functionality i.e,verification and all then they will give the license.
