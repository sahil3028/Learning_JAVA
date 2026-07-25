/*
========================================================
TOPIC : POJO (PLAIN OLD JAVA OBJECT)
========================================================

Definition:
A POJO is a simple Java class used mainly to hold related data, usually with private fields, a constructor, getters, setters, and toString.

Why Java provides this feature:
It gives a clear object model for real data such as a student without framework-specific complexity.

Real-world analogy:
A student admission form groups ID, name, date of birth, and course in one record.

How THIS file demonstrates the topic:
This file is POJO\Student.java. It contains or uses: Student. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Student, toString, getId, setId, getName, setName, getDateOfBirth, setDateOfBirth. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What makes a class a POJO? Why override toString? Why are fields private?

Key comparison:
A POJO is mutable when it has setters. A record is a compact immutable data carrier.
========================================================
*/
package POJO;

// Student is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate pojo (plain old java object).
public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;
    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getClassList() {
        return classList;
    }
    public void setClassList(String classList) {
        this.classList = classList;
    }
}