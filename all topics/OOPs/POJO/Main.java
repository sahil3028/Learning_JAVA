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
This file is POJO\Main.java. It contains or uses: Main, has. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What makes a class a POJO? Why override toString? Why are fields private?

Key comparison:
A POJO is mutable when it has setters. A record is a compact immutable data carrier.
========================================================
*/
package POJO;
//basic way to pupolate using obj and construstors
// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate pojo (plain old java object).
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
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
            System.out.println(s);  //java feature if we pass an objet it will print if the class has toString implementd
        }
    }
}