/*
========================================================
TOPIC : RUNTIME POLYMORPHISM AND METHOD OVERRIDING
========================================================

Definition:
Polymorphism lets one parent-type reference represent different child objects. At runtime Java selects the overridden method belonging to the real object.

Why Java provides this feature:
Code can work with all car types through Car without writing separate driving code for every type.

Real-world analogy:
A remote has one power button, but a TV and AC respond in their own way.

How THIS file demonstrates the topic:
This file is car_polymorphism\Car.java. It contains or uses: Car, GasPoweredCar, ElectricCar, HybridCar. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Car, startEngine, runEngine, drive, GasPoweredCar, ElectricCar, HybridCar. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is runtime polymorphism? Why can Car car = new ElectricCar(...) work? When is the overridden method chosen?

Key comparison:
Overriding happens in a child class; overloading uses the same method name with different parameter lists.
========================================================
*/
package car_polymorphism;

// Car is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate runtime polymorphism and method overriding.
public class Car {

    private String description;
    public Car(String description) {
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Car -> startEngine");
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

// GasPoweredCar extends Car, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    // This private field stores cylinders as part of this object's state. Keeping it private demonstrates encapsulation because outside code must use the class''s methods to access or change it.
    private int cylinders = 6;
    public GasPoweredCar(String description) {
        super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

// ElectricCar extends Car, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class ElectricCar extends Car {

    private double avgKmPerCharge;
    // This private field stores batterySize as part of this object's state. Keeping it private demonstrates encapsulation because outside code must use the class''s methods to access or change it.
    private int batterySize = 6;
    public ElectricCar(String description) {
        super(description);
    }
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

// HybridCar extends Car, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class HybridCar extends Car {

    private double avgKmPerLiter;
    // This private field stores cylinders as part of this object's state. Keeping it private demonstrates encapsulation because outside code must use the class''s methods to access or change it.
    private int cylinders = 6;

    private int batterySize;
    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}