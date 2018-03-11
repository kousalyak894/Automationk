package flowcontrolstatements;

public class Dowhile1 {

	public static void main(String[] args) {
		/*do{
			System.out.println("helo");
		}while(true);
		System.out.println("hi");*///it is un reachable because helo will be executed every time then when hi will get chance
       
		
		/*do{
			System.out.println("helo");
		}while(false);
		System.out.println("hi");*///here if it is false then helo will execute once loop will not continue ,it will go to next stmt hi.
	  
		/*int a=10,b=20;
	    do{
	        System.out.println("hello");
	    }while(a<b);
	    System.out.println("hi");*/  //in the compile time only will get unreachable error.here compiler wont check values so we wont get unreachability error, at the run time only jvm checks the value so hello will be printed infinite time.hi will not get chance to execute
	
		/*int a=10,b=20;
		do{
			System.out.println("helo");
		}while(a>b);
		System.out.println("hi");*/
		
		/*final int a=10,b=20;
		do{
			System.out.println("helo");
		}while(a<b);
		System.out.println("hi");*/         //final means at the complie time itself value will be known.here is true then helo will be execute infinate times then when hi will get chance to execute?.
	
		final int a=10,b=20;
		do{
			System.out.println("helo");
		}while(a>b);
		System.out.println("hi");    //complie time itself it will know it will be false then both will be executed once.
	}

}
