/*
Topic: What is String
Definition: A String stores text in Java and is immutable after creation.
Why / usage: Immutability makes text safe to share and predictable to use.
Where to use it: Use String for names, messages, file paths, and all normal text data.
*/
public class Demo {
	public static void main(String[] args) 
	{
		String name=new String();
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello "+name);
		System.out.println(name.concat("reddy"));
//      String name="Navin";
		
	}
}