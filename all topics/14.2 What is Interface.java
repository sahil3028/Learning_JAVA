/*
Topic: What is Interface
Definition: An interface defines a contract: classes promise to provide its methods.
Why / usage: It separates what code can do from how each class does it.
Where to use it: Use interfaces for interchangeable services, such as Payment, Sorter, Runnable, or Computer.
*/
interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}

