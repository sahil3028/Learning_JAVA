/*
Topic: Switch Sattement
Definition: These operators and control statements make decisions by evaluating conditions.
Why / usage: They choose different program paths based on data or state.
Where to use it: Use them for validation, menus, status handling, and business rules.
*/
public class hello {

	public static void main(String[] args) {
//		int n=1;
//		if(n==1)
//			System.out.println("Monday");
//		else if(n==2)
//			System.out.println("Tuesday");
//		else if(n==3)
//		System.out.println("Wednesday");
//		else if(n==4)
//		System.out.println("Thursday");
//		else if(n==5)
//		System.out.println("Friday");
//		else if(n==6)
//		System.out.println("Saturday");
//		else
//		System.out.println("Sunday");
		
		int n=8;
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
		System.out.println("Wednesday");
			break;
		case 4:
		System.out.println("Thursday");
			break;
		case 5:
		System.out.println("Friday");
			break;
		case 6:
		System.out.println("Saturday");
			break;
		case 7:
		System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number");			
		}
		
	}
}
