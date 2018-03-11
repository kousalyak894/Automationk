package flowcontrolstatements;

public class Dowhile {

	public static void main(String[] args) {
	    /* do{
			System.out.println("hi");
		}while(false);
*/		
		/*do;
		while(true);*/ //here there is atleast one statement that is semicolon*/
		
		 /*do{
		 int x=10;
		 }while(true);*/
		 
		
		
		/*do
			int x=10;
		while(true);//unreachable
		
		do
			while(true);//unreachable 
*/
		
		
		do 
			while(true)
			  System.out.println("helo");
		while(false);   //this is valid .this will not be un reachable because while(false) is a part on do and that is not a sepeartate statement.
	}

}
//if we want to execute loop body atleast once then will go for do-while.
//curly barces are optional and without curly braces we can take only one stmt bn do n while which should not be delaractive statement.
