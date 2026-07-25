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
This file is Inheritance\Fish.java. It contains or uses: Fish. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Fish, moveMuscles, moveBackFin, move, toString. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does extends mean? What is inherited? Why call super()? What is method overriding?

Key comparison:
Inheritance reuses a parent class. Composition stores another object as a field.
========================================================
*/
package Inheritance;

// Fish is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance and method overriding.
public class Fish extends Animal {

    private int gills;
    private int fins;
    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    // moveMuscles is a private helper method. Keeping this small behaviour inside the class hides implementation details while public methods expose the meaningful OOP behaviour.
    private void moveMuscles() {
        System.out.print("muscles moving ");
    }
    // moveBackFin is a private helper method. Keeping this small behaviour inside the class hides implementation details while public methods expose the meaningful OOP behaviour.
    private void moveBackFin() {
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}