/*
Topic: Ternary
Definition: These operators and control statements make decisions by evaluating conditions.
Why / usage: They choose different program paths based on data or state.
Where to use it: Use them for validation, menus, status handling, and business rules.
*/
public class hello {

	public static void main(String[] args) {
//		int n=4;
//		int result=0;
//		if(n%2==0)
//			result=10;
//		
//		else
//			result =20;
//		System.out.println(result);
		
		int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);
	}

}
