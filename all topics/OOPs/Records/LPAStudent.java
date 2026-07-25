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
This file is Records\LPAStudent.java. It contains or uses: LPAStudent. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: LPAStudent. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does a record generate automatically? Why are records immutable? What is the difference between name() and getName()?

Key comparison:
A POJO can be mutable through setters; a record has no setters and its components are final.
========================================================
*/
package Records;
// LPAStudent is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate java records and immutability.
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}