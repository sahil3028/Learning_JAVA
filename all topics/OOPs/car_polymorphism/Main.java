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
This file is car_polymorphism\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main, runRace. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is runtime polymorphism? Why can Car car = new ElectricCar(...) work? When is the overridden method chosen?

Key comparison:
Overriding happens in a child class; overloading uses the same method name with different parameter lists.
========================================================
*/
package car_polymorphism;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate runtime polymorphism and method overriding.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }
    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}