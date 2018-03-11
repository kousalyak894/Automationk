
public class Instanceblock {
	 Instanceblock(){
		 System.out.println("constructor");
	 }
	 Instanceblock(int a){//we can't write 2 constructors in one class.
		 System.out.println("constructor2");
	 }
	 {
		 System.out.println("instance block");//instance block will be executed first
	 }
	 {
		 System.out.println("instance block1");
	 }
	 {
		 System.out.println("instance block2");
	 }

	public static void main(String[] args) {
		new Instanceblock();
		new Instanceblock(10);
		

	}

}
//used to write the logics ,used to initialize instance variables:both are during object creation only
//if there are instance blocks in the class then first instance blocks will be executed and then constructors will be executed.
//constructor block logics are specific to all objects(for each constructor one object will be created).but instance block logics are common for all objects(for all objects single instance block will be executed) 
//so for each constructor execution instance block will be executed.
//we can write multiple instance blocks in one class.
