/*
Topic: Exception Handling with try catch
Definition: Exception handling detects and manages abnormal situations so a program can fail safely or recover.
Why / usage: It separates normal program flow from error-handling code.
Where to use it: Use it around file, database, input, network, and validation operations that can fail.
*/
public class Demo {
    public static void main(String[] args) {
    
    int i=0;
    int j=0;
   
    try
    {
    	j=18/i;
    }
    catch(Exception e)
    {
    	System.out.println("Something went wrong");
    }
    System.out.println(j);
    
    System.out.println("Bye");
    }
}
