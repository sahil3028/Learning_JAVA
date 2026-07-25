/*
Topic: Stack and Heap
Definition: Stack memory stores method calls and local variables; heap memory stores objects created with new.
Why / usage: This model explains object references, lifetime, and method execution.
Where to use it: Use this concept to understand references, object sharing, recursion, and memory-related bugs.
*/
class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class Demo {
	public static void main(String[] args) {
		int data=10;
		Calculator obj=new Calculator();
		Calculator obj1=new Calculator();
		int r1=obj.add(3,4);
		//System.out.println(r1);
		obj.num=8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}