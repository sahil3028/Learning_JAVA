/*
========================================================
TOPIC : INHERITANCE AND METHOD OVERRIDING
========================================================

Definition:
Inheritance lets a child class reuse accessible fields and methods from a parent class, forming an IS-A relationship.

Why Java provides this feature:
Common Animal behaviour is written once, while Dog and Fish add their own specialised behaviour.

Real-world analogy:
A dog IS AN animal and a fish IS AN animal, but they move differently.

How THIS file demonstrates the topic:
This file is Inheritance\Animal.java. It contains or uses: Animal. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Animal, toString, move, makeNoise. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does extends mean? What is inherited? Why call super()? What is method overriding?

Key comparison:
Inheritance reuses a parent class. Composition stores another object as a field.
========================================================
*/
package Inheritance;

// Animal is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance and method overriding.
public class Animal {

    protected String type;
    private String size;
    private double weight;

    //default constructor
    public Animal() {

    }

    //constructors with some arguments
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}