/*
Topic: Multiple Threads
Definition: Threads allow more than one task to make progress within a program.
Why / usage: They keep long-running work from blocking other work.
Where to use it: Use threads or executors for background work, servers, downloads, and responsive user interfaces.
*/
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
}

