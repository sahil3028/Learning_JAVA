/*
Topic: Enum Class
Definition: An enum defines a fixed set of named constants as a type.
Why / usage: It replaces error-prone strings or numbers with a safe, readable set of choices.
Where to use it: Use it for states and categories such as order status, days, directions, or roles.
*/
enum Laptop{
//	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
	Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);
	
	private int price;
	
	private Laptop()
	{
		price=500;
	}
	
	private Laptop(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
		System.out.println("in Laptop" + this.name());
	}
}

public class Demo {
    public static void main(String[] args) {

//    	Laptop lap=Laptop.Mackbook;
//    	System.out.println(lap+ " : "+lap.getPrice());
    	
    	for(Laptop lap : Laptop.values())
    	{
    		System.out.println(lap+" : "+lap.getPrice());
    	}
    }
}

