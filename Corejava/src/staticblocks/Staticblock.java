package staticblocks;

public class Staticblock {
	Staticblock(){
		System.out.println("constructor 1");
	}
	Staticblock(int a){
		System.out.println("constructor 2");
	}
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	static{                                //if we wont create object also static class will be executed.because at the time of class loading static will executed so it wont wait for object creation.
		System.out.println("static block 1");
	}
	static{
		System.out.println("static block 2");
	}

	public static void main(String[] args) {
		new Staticblock();
		new Staticblock();
		new Staticblock(10);//instance block will be executed every time when ever the object is created but static block will be executed only once.because class will be loaded only once.

	}
}


//static blocks are used to write the logics.these logics are executed  during .class file loading.
//DURING .CLASS FILE LOADING INTO THE MEMORY this static blocks will be executed.
//jvm loads .class file byte code into memory then static blocks will be executed afetr that jvm calls main method to start execution.
//static block executed only once when class is loaded.class will be loaded only once.
//inside the class multiple instance blocks are also possible and multiple static blocks are also possible
//so if we create static blocks,instance blocks and constructors,first static block will be executed because it will execute at the time of class loading itself.
//without main static should execute because it depends on when class loaded...but upto 1.5 version it is possible to execute static without main.but from 1.6 main should be there to execute static blocks.
