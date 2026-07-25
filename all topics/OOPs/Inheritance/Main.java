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
This file is Inheritance\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main, doAnimalStuff. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does extends mean? What is inherited? Why call super()? What is method overriding?

Key comparison:
Inheritance reuses a parent class. Composition stores another object as a field.
========================================================
*/
package Inheritance;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate inheritance and method overriding.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}