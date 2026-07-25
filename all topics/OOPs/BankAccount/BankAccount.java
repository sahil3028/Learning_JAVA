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
This file is BankAccount\BankAccount.java. It contains or uses: BankAccount. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: deposit, withdraw, getAccountNo, setAccountNo, getBalance, setBalance, getName, setName. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why are fields private? What is constructor chaining? Why use this.field = field?

Key comparison:
Encapsulation protects data. Inheritance reuses behaviour through an IS-A relationship.
========================================================
*/
package BankAccount;

// BankAccount is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation and constructors.
public class BankAccount {
    private int accountNo;
    private int balance;
    private String name;
    private String email;
    private int phone;
    public void deposit(int money){
        balance+=money;
    }
    public void withdraw(int money){
        if(balance-money>=0){
            balance-=money;
        }
       else System.out.println("garib");
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }


}