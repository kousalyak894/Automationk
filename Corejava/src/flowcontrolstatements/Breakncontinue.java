package flowcontrolstatements;

public class Breakncontinue {

	public static void main(String[] args) {
		
           for(int i=0;i<10;i++){
        	   if(i==5)
        		   break;
        	   System.out.println(i);
           }
           
           for(int i=0;i<10;i++){
        	   if(i==5)
        		   continue;
        	   System.out.println(i);
           }
	}

}

//break is used to stop the execution of for loop.
//in entire java we can able to use break stmt in only 2 areas,switch and loops.
//when ever continue is encountred it will skip the perticular execution and control will goes to next iteration.
