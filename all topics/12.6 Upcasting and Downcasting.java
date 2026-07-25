/*
Topic: Upcasting and Downcasting
Definition: Upcasting stores a child object in a parent reference; downcasting restores access to child-specific members.
Why / usage: It supports polymorphism while allowing specialised behaviour when it is safe.
Where to use it: Use downcasting only after checking the runtime type with instanceof.
*/
class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  Demo{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	A obj=new B();
    	obj.show1();
    	
    	B obj1=(B)obj;
    	obj1.show2();
    }
}

