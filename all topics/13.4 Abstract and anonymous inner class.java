/*
Topic: Abstract and anonymous inner class
Definition: An abstract class cannot be instantiated and can require subclasses to implement unfinished behaviour.
Why / usage: It provides a shared base design while leaving specific details to child classes.
Where to use it: Use it when related classes share common code but each must complete different operations.
*/
abstract class A
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Demo{
    public static void main(String[] args) {
    	
//    	A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    	
    }
}

