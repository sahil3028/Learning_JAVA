/*
========================================================
TOPIC : COMPOSITION
========================================================

Definition:
Composition is a HAS-A relationship: one class stores and uses objects of other classes as its parts.

Why Java provides this feature:
It models real objects from smaller reusable components and keeps responsibilities separated.

Real-world analogy:
A personal computer HAS-A monitor, motherboard, and computer case; it is not a monitor.

How THIS file demonstrates the topic:
This file is composition\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is PersonalComputer composition? Can a Product object have its own behaviour? Why is composition often preferred over inheritance?

Key comparison:
Inheritance means IS-A. Composition means HAS-A and is used when one object is built from parts.
========================================================
*/
package composition;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);
        Product pro =new Product();

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}