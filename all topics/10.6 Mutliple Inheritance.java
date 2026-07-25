/*
Topic: Mutliple Inheritance
Definition: Inheritance lets a child class reuse fields and methods from a parent class (an IS-A relationship).
Why / usage: It avoids repeating common code in related classes.
Where to use it: Use it for related types such as Employee/Manager, Vehicle/Car, or Animal/Dog.
*/
class A{
	
}
class B extends A{
	
}
//class C extends A,B
// Multiple inheritance does not supported by Java
// Ambiguity issue
class C extends B{
	
}

public class Demo{
	public static void main(String args[])
	{
		
	}
}