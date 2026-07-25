/*
Topic: default vs parameterized constructor
Definition: Constructors initialise objects; this refers to the current object and super refers to the parent-class part of an object.
Why / usage: They make object initialisation and inheritance explicit and safe.
Where to use it: Use them when setting fields, chaining constructors, or initialising a superclass.
*/
class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
	}
	public Human(String name) {
		this.age=age;
		this.name=name;
	}
	public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		Human obj1=new Human(18, "Navin");
		System.out.println(obj.getName()+" : "+obj.getAge());
//		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
//		obj.SetAge(30);
//		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}


