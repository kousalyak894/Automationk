package flowcontrolstatements;

public class Exm1 {
     
	public static void main(String[] args) {
		int a=10;
		if(a==10)//1.if contidion is true then if satement will execute other wise it will execute else statement
		{
			System.out.println("true");
		}
		else 
			System.out.println("false");
		
		if(false)
		{//2.for the if condition it is possible to assign condition as a boolean argument.
			System.out.println("true stmt");
		}
		else
			System.out.println("false stmt");

	}

}
//conditional statements:based on condition corresponding block will be executed.
//iteration stmt:to repeat the loop we will use iteration statements.
//transfer stmt:to transfer the flow of execution from 1st position to 10 th position.so to transfer the control from one position to another position we will use transfer statements.
//3.without curly braces it is possible to take only one statement.
//4.0-false,1-true..this will not allow in java.only in c it is possible.
