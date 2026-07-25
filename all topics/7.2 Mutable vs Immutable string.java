/*
Topic: Mutable vs Immutable string
Definition: A String stores text in Java and is immutable after creation.
Why / usage: Immutability makes text safe to share and predictable to use.
Where to use it: Use String for names, messages, file paths, and all normal text data.
*/
public class Demo {
	public static void main(String[] args) 
	{
		String name="navin";
		name=name+"reddy";
		System.out.println("hello"+name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
	}
}