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
This file is InheritanceExample\Employee.java. It contains or uses: Employee. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Employee, toString. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is Worker a base class? What does @Override do for collectPay? What is inherited versus specialised?

Key comparison:
The parent reference can point to different employee subclasses; that is polymorphism built on inheritance.
========================================================
*/
package InheritanceExample;

// Employee is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance hierarchy and polymorphism.
public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    // This static counter belongs to the Employee class itself, not to one Employee object. It gives each newly created employee a different id.
    private static int employeeNo = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}