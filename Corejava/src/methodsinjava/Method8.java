package methodsinjava;

public class Method8 {
	Method8 m1(){
		/*Method8 m=new Method8();
	    return m;*/
		return new Method8();
	}
    Method8 m2(){
    	 return this;
    }
	

	public static void main(String[] args) {
		Method8 mm=new Method8();//now we have to call m1 and m2 methods .so need to create object.
		Method8 mm1=mm.m1();//now i will call m1 method by using object and then i will store it in the variable.
		Method8 mm2=mm.m2();
		

	}

}
//if the return type is same class then we can use this keyword.
