/*
Topic: Anonymous Object
Definition: An anonymous object is created and used immediately without storing it in a variable.
Why / usage: It is concise when the object is needed only once.
Where to use it: Use it for one-time method calls; use a named reference when the object will be reused.
*/
class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		int marks;
		marks=99;
		
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		A obj;
		obj=new A();
		
		obj.show();
	}
}


