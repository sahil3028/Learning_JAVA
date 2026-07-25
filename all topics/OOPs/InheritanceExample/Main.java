/*
========================================================
TOPIC : INHERITANCE HIERARCHY AND POLYMORPHISM
========================================================

Definition:
A class hierarchy places shared employee data and behaviour in parent classes, then lets specialised workers calculate pay differently.

Why Java provides this feature:
It avoids repeating name, birth date, and termination logic in every employee type.

Real-world analogy:
All employees belong to one company, but hourly and salaried workers are paid by different rules.

How THIS file demonstrates the topic:
This file is InheritanceExample\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is Worker a base class? What does @Override do for collectPay? What is inherited versus specialised?

Key comparison:
The parent reference can point to different employee subclasses; that is polymorphism built on inheritance.
========================================================
*/
package InheritanceExample;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance hierarchy and polymorphism.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}