package methodsinjava;

public class Method4 {
	int x=10;
	int y=30;
	
	void sum(int x,int y){
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	static void mul(int x,int y){
		System.out.println(x+y);
		//System.out.println(this.x+this.y); inside static area this keyword is not allowed.
	}

	public static void main(String[] args) {
		Method4 m=new Method4();
		m.sum(40,50);

	}

}
//if application contains local variable and global variable with the same name then to differentiate,we will use this keyword.
//in java ,this keyword is not allowed in static area.
//java does not support operator overloading but it supports only + operator.