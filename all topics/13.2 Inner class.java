/*
Topic: Inner class
Definition: An inner class is declared inside another class and can model behaviour closely tied to the outer class.
Why / usage: It keeps helper types near the object they support.
Where to use it: Use it when the nested type has no useful meaning outside its enclosing class.
*/
class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


public class  Demo{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	A.B obj1=new A.B();
    	obj1.config();

    }
}

