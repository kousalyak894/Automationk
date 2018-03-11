package methodsinjava;
class Employee{}

public class Method7 {
	
	Student s(){//here i passed student and employee class as a return type.in real time projects the classes are present in the other modules.so,we can create the object then we can return those values.
		Student ss=new Student();
		return ss;
	}
	Employee e(){
		Employee ee=new Employee();
		return ee;
	}

	public static void main(String[] args) {
		Method7 m=new Method7();
		Student s1=m.s();
		Employee e1=m.e();
		System.out.println(s1);
		System.out.println(e1);

	}

}
//if the method return type is class then create the reference object for that class then return the object.
//if the method return type is same class then we can use this keyword to return that object
