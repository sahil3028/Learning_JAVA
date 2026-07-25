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
This file is Records\Main.java. It contains or uses: Main, is. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does a record generate automatically? Why are records immutable? What is the difference between name() and getName()?

Key comparison:
A POJO can be mutable through setters; a record has no setters and its components are final.
========================================================
*/
package Records;
//much less boiler code in records
//cant be changed or added in the lists
//it is final list and immuatble 
// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate java records and immutability.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        //here we are modifying a variable of a class
        //since the record is immutable it can only be set once while creating an object
        //in POJO it can be modified
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}