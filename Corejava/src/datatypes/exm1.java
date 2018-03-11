package datatypes;

public class exm1 {
	
	int a=10;//4 bytes are allocated in memory...10 is constant value or literals
	float b=1.29f;//4 bytes are allocated in memory
	char c='k';//2 bytes are allocates in memory
	//float d=10.8; will get compliation error because by default all decimal values will be double.but float requires float value so, after decimal we will give the constant as f.so that it will take float value. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//datatypes are representing type of the variable.
//data type decides memory size of the variable.
//range value decided by data type.
//java contains 8 premitive data type:byte-1(size),short-2bytes,int-4b,long-8b,float-4b,double-8b,char-2b,boolean-no size
//; it is the statement terminator.
//if we wont assign any values to the variables then default values are printed.byte-0 default,short-0 default,int-0 default,long-0 default,float-0.0 default,double-0.0 default,char-single space,boolean-false
//jvm will assign default values.