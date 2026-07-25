/*
Topic: Functional Interface New
Definition: An interface defines a contract: classes promise to provide its methods.
Why / usage: It separates what code can do from how each class does it.
Where to use it: Use interfaces for interchangeable services, such as Payment, Sorter, Runnable, or Computer.
*/
@FunctionalInterface
interface A
{
	void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Demo {
    public static void main(String[] args) {
    	
    	A obj=new A()
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
 //   	A obj=new A();
 //   	A obj=new B();
    	obj.show();
    }
}

