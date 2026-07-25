/*
========================================================
TOPIC : ENCAPSULATION AND CONSTRUCTORS
========================================================

Definition:
Encapsulation means keeping an object's data private and allowing controlled access through methods. Constructors create objects with an initial valid state.

Why Java provides this feature:
It prevents outside code from changing important data carelessly and gives the class one place to enforce rules.

Real-world analogy:
A bank account is like a locked ATM: you cannot directly change the balance; you ask the account to deposit or withdraw.

How THIS file demonstrates the topic:
This file is BankAccount\Main.java. It contains or uses: and, static, name, Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why are fields private? What is constructor chaining? Why use this.field = field?

Key comparison:
Encapsulation protects data. Inheritance reuses behaviour through an IS-A relationship.
========================================================
*/
package BankAccount;

/*
object= instance
name of object =refrence

in constructor chaining always use the "this" statement in the first line

static and instance variable
if we create an object of a class and  change the value of the static variable by multiple obj it will retain only the last one and will show same for every other obj so basically its a variable representing whole class

static and instance methods
we have to create a instance(Object) to call an instance method(non static)
using only class name would do the work for static method no need to create a separate instance

*/


// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation and constructors.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {
        BankAccount c1=new BankAccount();
        c1.setBalance(100);
        c1.setEmail("s");
        c1.setAccountNo(1);
        c1.setName("c1");
        c1.setPhone(55);
        System.out.println(c1.getBalance());
        c1.withdraw(99);
        System.out.println(c1.getBalance());
        c1.withdraw(99);

        Custumer cp1=new Custumer();
        System.out.println(cp1.getName());
        System.out.println(cp1.getCreditLimit());

    }
}