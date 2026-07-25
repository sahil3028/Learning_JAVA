/*
========================================================
TOPIC : COMPOSITION AND DELEGATION
========================================================

Definition:
Composition gives one class references to helper objects. Delegation means the containing object asks those helpers to perform their own jobs.

Why Java provides this feature:
Each appliance owns one responsibility, while SmartKitchen coordinates them.

Real-world analogy:
A kitchen HAS-A coffee maker, refrigerator, and dishwasher; the kitchen manager delegates the correct task to each appliance.

How THIS file demonstrates the topic:
This file is smartKitchen_Composition\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is this not inheritance? Which class owns the appliance references? How does SmartKitchen delegate work?

Key comparison:
Composition models HAS-A. Delegation is the action of forwarding work to the contained object.
========================================================
*/
package smartKitchen_Composition;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition and delegation.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}