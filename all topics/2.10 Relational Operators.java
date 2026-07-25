/*
Topic: Relational Operators
Definition: These operators and control statements make decisions by evaluating conditions.
Why / usage: They choose different program paths based on data or state.
Where to use it: Use them for validation, menus, status handling, and business rules.
*/
public class hello {

	public static void main(String[] args) {
		int x=6;
		int y=5;
//		boolean result= x<y;
//		boolean result= x>y;
//		boolean result= x>=y;
//		boolean result= x<=y;
//		boolean result= x!=y;
		boolean result= x==y;
		System.out.println(result);
		
		double a=8.8;
		double b=9.8;
//		boolean res = a<=b;		
		boolean res = a>=b;
	
		System.out.println(res);
	}

}