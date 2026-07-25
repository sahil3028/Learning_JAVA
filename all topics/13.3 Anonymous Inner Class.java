/*
Topic: Anonymous Inner Class
Definition: An anonymous inner class creates a one-time subclass or interface implementation without naming a separate class.
Why / usage: It keeps short custom behaviour close to where it is used.
Where to use it: Use it for small callbacks or one-off overrides; lambdas are often simpler for functional interfaces.
*/
class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  Demo{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    }
}

