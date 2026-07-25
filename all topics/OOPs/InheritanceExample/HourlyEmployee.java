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
This file is InheritanceExample\HourlyEmployee.java. It contains or uses: HourlyEmployee. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: HourlyEmployee, collectPay, getDoublePay. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is Worker a base class? What does @Override do for collectPay? What is inherited versus specialised?

Key comparison:
The parent reference can point to different employee subclasses; that is polymorphism built on inheritance.
========================================================
*/
package InheritanceExample;

// HourlyEmployee is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance hierarchy and polymorphism.
public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }
    public double getDoublePay() {
        return 2 * collectPay();
    }
}