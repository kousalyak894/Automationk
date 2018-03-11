//1.select the editor.
//2.write the app
package firstapp;
import java.lang.System;//java.lang.* will import all the classes which are in the package.
import java.lang.String;

public class Exm1 {

	public static void main(String[] args) {//here there are two system defined classes String and System which will be imported from java.lang package.
		System.out.println("first application");

	}
}
class A{
		public void main(String[] args) {
			System.out.println("A application");
	}
}
class B{
		public void main(String[] args) {
			System.out.println("B application");
	}
}


//3.save the app ->if class is public you can save with that class name.if any class is not public you can save it with any name as your wish.
//source file allows only one public class.
//4.compilation process->javac filename.java
//responsibilites of compiler->it will check syntax errors and .java file will converted into .class file
//.class file generates based on no.of classes present in source file.//eg:above,3 class files will be generated.
//5.execution process
//we complied .java file we get .class file which will convert into byte code...so will execute .class file
//syntax:java classname.we have 3 classes here.
//so which class will execute
//execution always starts from main method.jvm will call main method.so responsibility of executing main method is jvm.
//2 respon. of jvm->first it will load the .class file(byte code) into memory and then it will call main method to start the execution.
//java contains 14 predefined classes eg:java.lang,java.io......
//but no need to import all predefined packages in java.it is optional to import.
//default package in java is java.lang.
//why?..the basic operation is performed by predefined classes like,String,System etc...so that are present in java.lang.so james gosling made it as a default package.
//it is possible to maintain multiple classes in one source file.we can execute multple cls.but in real time it we wont use this.In real time if there are 100 classes ,1 class will have main method and remaining 99 classes will be controlled by that class.
//if we have public class ,but you saved class name as diff,then will get compile time error.we have to save with that public class name only.
//note:1.source file allows to declare how many classes:any number of classes.
//2.source file allows to declare how many public classes:one public class and many non public classes.
//3.compiler responsibilites:checks for syntax errors and converts .java file to .class file.
//compilation happens by .java file
//execution happens by .class file.
//we can execute multiple main class in one source file.










