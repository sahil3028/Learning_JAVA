package BankAccount;

import java.util.PrimitiveIterator;

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
