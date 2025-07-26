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


public class Main {
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
