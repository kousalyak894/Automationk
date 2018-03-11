package flowcontrolstatements;

public class Forloop1 {

	public static void main(String[] args) {
		/*int i=0;
		for(System.out.println("helo");i<3;System.out.println("hai")){
			i++;
		}*/
		
		/*for(;;)   //infinate loop
		{
			System.out.println("hi");
		}*/
		
		//for(;;);    //infinate loop
		
		/*for(int i=0;true;i++){
			System.out.println("helo");
		}
		System.out.println("hi");*///unreachable...
		
		/*for(int i=0;false;i++){
			System.out.println("helo");
		}
		System.out.println("hi");*///if it is false then in the curly brace itself will be unreachable.
		
		 /*int a=10,b=20;
		for(int i=0;a<b;i++){
			System.out.println("helo");
		}
		System.out.println("hi");*/
		
		/*int a=10,b=20;
		for(int i=0;a>b;i++){
			System.out.println("helo");
		}
		System.out.println("hi");*/
		
		/*final int a=10,b=20;
		for(int i=0;a<b;i++){
			System.out.println("helo");
		}
		System.out.println("hi");*/  //at the complie time itself it knows the value .so it is unreachable.
        
		
		/*final int a=10,b=20;
		for(int i=0;a>b;i++){
			System.out.println("helo");
		}
		System.out.println("hi"); */   //at the complie time itself it knows the value .so it is unreachable.form braces starting only the code will be unreachable
	}

}
//conditional check:
//conditional check is optional.by default compiler will place true.
//here we can take any java valid experession but should be of type boolean.
//inc or dec :
//in the inc or dec section we can take any valid java stmt including sop.
//all 3 parts of for loop are independent of each other and optional.
