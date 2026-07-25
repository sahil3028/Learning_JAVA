/*
Topic: Lambda Expression with return statement
Definition: A lambda expression is a short function-like implementation of a functional interface.
Why / usage: It reduces boilerplate for small pieces of behaviour.
Where to use it: Use it with streams, comparators, listeners, and Runnable tasks.
*/
FunctionalInterface
interface A
{
	int add(int i, int j);
}


public class Demo {
    public static void main(String[] args) {
//    	
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};
    	
    	A obj=(i,j) -> i+j;
   	
   	int result=obj.add(5, 4);
   	System.out.println(result);
    }
}

