/*
========================================================
TOPIC : JAVA RECORDS AND IMMUTABILITY
========================================================

Definition:
A record is a compact Java data carrier that automatically provides final fields, accessors, a constructor, equals, hashCode, and toString.

Why Java provides this feature:
It removes boilerplate when an object mainly represents data that should not change after creation.

Real-world analogy:
A printed student ID card contains fixed details; to change a detail, issue a new card.

How THIS file demonstrates the topic:
This file is Records\Student.java. It contains or uses: Student. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Student, toString, getId, setId, getName, setName, getDateOfBirth, setDateOfBirth. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does a record generate automatically? Why are records immutable? What is the difference between name() and getName()?

Key comparison:
A POJO can be mutable through setters; a record has no setters and its components are final.
========================================================
*/
package Records;

// Student is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate java records and immutability.
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