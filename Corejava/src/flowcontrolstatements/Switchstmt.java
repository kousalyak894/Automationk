package flowcontrolstatements;

public class Switchstmt {

	public static void main(String[] args) {
		int a=30;
		switch(a){//arg allows byte, int,short,String enum,char
		case 10+20:System.out.println("case 10 executed");
		        break;
		case 20*10:System.out.println("case 20 executed");
		        break;  
		case 300:System.out.println("case 30 executed");
		        break;
		case 40:System.out.println("case 40 executed");
		        break;
		default:System.out.println("default will be executed if there are no possible cases");
		        break;
		
		}
		byte b=10;
		switch(b){
		default:System.out.println("......");//cases are also optional inside the switch
		}
		
		byte c=10;
		switch(c){
		}//inside switch both case and default are optional.if we execute it,code will be executed but empty

		/*byte d=10;
		switch(d){
		      System.out.println(d);//print stmt is not allowed.if case is present then it is allowed
		}*/
	
	}

	  

}
//switch is used to take multiple options.
//based on switch argument the cases are executed.if cases are not matched default will be executed.but inside switch default is optional.
//switch allows us to take argument.int,short,byte,char,enum(version 1.5 onwords),string(version 1.7 onwards) is allowed but long,double,float is not allowed.because long,double is having too much range .and float is having infinity range so not allowed.
//switch allows corresponding wrapper class also.
//switch allows expressions in the case labels if it is valid.
//eg:case 10+20:.....this will be allowed
//case 10*20:...will not be allowed.
//if we wont provide break statements ,it will continue execution even after particular case is found.
//dupliacte case labels are not allowed.will generate error msg.
//inside switch ,cases are also optional.default will be executed if no cases are present.