/*
Topic: enum if and switch
Definition: An enum defines a fixed set of named constants as a type.
Why / usage: It replaces error-prone strings or numbers with a safe, readable set of choices.
Where to use it: Use it for states and categories such as order status, days, directions, or roles.
*/
enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	Status s=Status.Pending;
    	
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	if(s==Status.Running)
    		System.out.println("All Good");
    	else if(s==Status.Failed)
    		System.out.println("Try Again");
    	else if ( s==Status.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
}

