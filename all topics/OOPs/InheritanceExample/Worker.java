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
This file is InheritanceExample\Worker.java. It contains or uses: Worker. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Worker, getAge, collectPay, terminate, toString. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is Worker a base class? What does @Override do for collectPay? What is inherited versus specialised?

Key comparison:
The parent reference can point to different employee subclasses; that is polymorphism built on inheritance.
========================================================
*/
package InheritanceExample;

// Worker is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance hierarchy and polymorphism.
public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;
    public Worker() {

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge() {

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }
    public double collectPay() {
        return 0.0;
    }
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}