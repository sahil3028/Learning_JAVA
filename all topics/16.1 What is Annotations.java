/*
Topic: What is Annotations
Definition: An annotation adds metadata to Java code for the compiler, tools, or frameworks.
Why / usage: It communicates extra information without changing normal program logic.
Where to use it: Use annotations such as @Override, @Deprecated, or framework annotations in Spring and JUnit.
*/
@Deprecated
class A
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class B extends A 
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

public class Demo {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}

