/*
Topic: Methods
Definition: A method is a named block of behaviour belonging to a class.
Why / usage: It groups reusable logic and gives objects clear actions.
Where to use it: Use methods for calculations, validation, printing, and operations on object state.
*/
package classDemo;
/**
class Calculator{
	int a;
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
}

public class Demo {

	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result = calc.add(num1,num2);
		System.out.println(result);
	}
}
	**/

class Computer
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}


public class Demo {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.playMusic();
		String src=obj.getMeAPen(10);
		System.out.println(src);
	}
}
