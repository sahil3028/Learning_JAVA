/*
Topic: Lambda Expression
Definition: A lambda expression is a short function-like implementation of a functional interface.
Why / usage: It reduces boilerplate for small pieces of behaviour.
Where to use it: Use it with streams, comparators, listeners, and Runnable tasks.
*/
@FunctionalInterface
interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class Demo {
    public static void main(String[] args) {
    	
 //   	A obj=() -> System.out.println("in Show");  
 //   	obj.show();
    	
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);
    	
    	A obj=i -> System.out.println("in show "+i);
    	obj.show(5);
    }
}

