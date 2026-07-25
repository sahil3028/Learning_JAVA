/*
Topic: this vs super keyword
Definition: Constructors initialise objects; this refers to the current object and super refers to the parent-class part of an object.
Why / usage: They make object initialisation and inheritance explicit and safe.
Where to use it: Use them when setting fields, chaining constructors, or initialising a superclass.
*/
class A extends Object
{
	int num= 1;
}

class B extends A
{
	int num=2;
	public int getValue()
	{
		int num=3;
//		return this.num;
		return super.num;
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		B obj=new B();
//		System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
}