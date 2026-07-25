/*
Topic: What is Enum
Definition: An enum defines a fixed set of named constants as a type.
Why / usage: It replaces error-prone strings or numbers with a safe, readable set of choices.
Where to use it: Use it for states and categories such as order status, days, directions, or roles.
*/
enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());
    	
    	Status[] ss=Status.values();
    	System.out.println(ss);
    	
    	for(Status s:ss)
    	{
    		System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}
    	
    	
        
    }
}