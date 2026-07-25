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
This file is composition\Product.java. It contains or uses: Product, Monitor, Motherboard, ComputerCase. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Product, Monitor, drawPixelAt, Motherboard, loadProgram, ComputerCase, pressPowerButton. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is PersonalComputer composition? Can a Product object have its own behaviour? Why is composition often preferred over inheritance?

Key comparison:
Inheritance means IS-A. Composition means HAS-A and is used when one object is built from parts.
========================================================
*/
package composition;

// Product is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition.
public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;
    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    public Product() {

    }
}

// Monitor extends Product, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class Monitor extends Product {

    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d,%d in color %s ", x, y, color));
    }
}

// Motherboard extends Product, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots,
                       String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}

// ComputerCase extends Product, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class ComputerCase extends Product {

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}