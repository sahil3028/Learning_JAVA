/*
Topic: Do While Loop
Definition: A loop repeats code while a condition is true or for each item in a sequence.
Why / usage: It avoids writing the same statement many times.
Where to use it: Use loops to process arrays, collections, files, or repeated user input.
*/
public class hello {

	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println("Hi"+i);
			i++;
		}
		while(i<=4);
	}
}