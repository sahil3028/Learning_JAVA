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
This file is composition\PersonalComputer.java. It contains or uses: PersonalComputer. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: PersonalComputer, drawLogo, powerUp. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is PersonalComputer composition? Can a Product object have its own behaviour? Why is composition often preferred over inheritance?

Key comparison:
Inheritance means IS-A. Composition means HAS-A and is used when one object is built from parts.
========================================================
*/
package composition;

// PersonalComputer is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition.
public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    // drawLogo is a private helper method. Keeping this small behaviour inside the class hides implementation details while public methods expose the meaningful OOP behaviour.
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}