package flowcontrolstatements;

public class Whilestmts {

	public static void main(String[] args) {
		/*while(true){
			System.out.println("helo");
		}
		System.out.println("hi");    //in the compile time itself will get an error .if it is true helo will keep on executing then hi statement will not get the chance .so in the compile time itself it will show an error that sop(hi) is an unreachable code.
		
		while(false){
			System.out.println("helo");
		}
		System.out.println("hi");*/   //if it is false the loop body itself will never get the chance to execute.so the total will be unreachable.
		//int a=10,b=20;
		/*while(a<b){
			System.out.println("helo");
		}
		System.out.println("false");
		
		while(a>b){
			System.out.println("helo");
		}
		System.out.println("hi");*/    //compiler is responsible for checking the unrechability.jvm will not check it will execute thats it. run time only values will be considered.so,at complie time compiler will check whether it is true or false
		
		//final int c=10, d=20;
		/*while(c>d){
			System.out.println("helo");
		}
		System.out.println("hi");
		
		while(c>d){
			System.out.println("helo");
		}
		System.out.println("hi");*/   //here compiler knows that c and d values and that will be true or false.here compiler will consider values because it is final.then if it is true helo will keep on running then when hi will get execute.so this will be unreachable code.
		
        
		/*final int a=10;
		int b=20;
		System.out.println(a);
		                          //after compilation it will be like sop(10),sop(b).so if it is final then at the compile time time itself value will be decided it wont wait upto the runtime.
		System.out.println(b);*/
		
		
		/*final int a=10,b=20;  //every final variable will be replaced by compile time itseelf.
		int c=30;
		System.out.println(a+b);
		System.out.println(b<c);   //after compilation:sop(30),sop(20<c),sop(10+c)
		System.out.println(a+c); //if every arg is a final variable(compile constant)then that that operation should be performed at compile time only. 
		*/
	}

}

//if we know no of iterations,then will go for forloop.
//if we dont know the no of iteration,then will use while loop.
//argument in while should be in boolean type.if we try other type then will get an error.
//under while curly braces are optional but only one statement we write without curly braces.if there are more statements we have to use braces.and that one statement should not be declarative statemnt.
