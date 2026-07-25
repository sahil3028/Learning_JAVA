/*
Topic: Logical Operators
Definition: These operators and control statements make decisions by evaluating conditions.
Why / usage: They choose different program paths based on data or state.
Where to use it: Use them for validation, menus, status handling, and business rules.
*/
public class hello {

	public static void main(String[] args) {
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		
//		boolean result= x>y && a<b ;
//		boolean result= x>y || a<b ;
//		boolean result= x>y && a>b ;
//		boolean result= x>y || a>b ;
//		boolean result= x<y && a<b ;
//		boolean result= x<y || a<b ;
//		boolean result= x<y || a<b || a>1 ;
		
//		System.out.println(result);
		
		boolean result= a>b ;
		System.out.println(!result);
		
	}

}
