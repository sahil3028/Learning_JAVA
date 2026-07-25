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
This file is BankAccount\Custumer.java. It contains or uses: Custumer. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Custumer, getName, getCreditLimit, getEmail. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why are fields private? What is constructor chaining? Why use this.field = field?

Key comparison:
Encapsulation protects data. Inheritance reuses behaviour through an IS-A relationship.
========================================================
*/
package BankAccount;

// Custumer is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation and constructors.
public class Custumer {
    private String name;
    private int creditLimit;
    private String email;
    public Custumer(){
        this("c2",500,"mail");
        System.out.println("no args constructor used");
    }
    public Custumer(String name, String email) {
        this(name,999,email);
    }
    public Custumer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}