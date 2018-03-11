package variablesinjava;

public class Instvsstac {
	
	int eid=101;
	String empname="kkkk";
	static String empcompany="HCL";//wont create seperate memory every time.
	
	int eid1=102;
	String empname1="shjvhcj";
	//static String empcompany1="HCL"; waste of memory by creating again

	public static void main(String[] args) {
		Instvsstac is=new Instvsstac();
		System.out.println(is.eid);
		System.out.println(is.empname);
		System.out.println(is.empcompany);
		 
		
		Instvsstac is1=new Instvsstac();
		System.out.println(is1.eid1);
		System.out.println(is1.empname1);
		System.out.println(is1.empcompany);
		
	}

}
//in the above example,eid will be different ,emp name may be different but company will be same for that employee .so at this time we can make that variable as static because no need to create copy each time when object is created if company name is same.
//so seperate memory will not create each n every time.and memory will be saved.