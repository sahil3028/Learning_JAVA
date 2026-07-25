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
This file is smartKitchen_Composition\SmartKitchen.java. It contains or uses: SmartKitchen, CoffeeMaker, Refrigerator, DishWasher. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: SmartKitchen, getBrewMaster, getIceBox, getDishWasher, setKitchenState, doKitchenWork, setHasWorkToDo, brewCoffee. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is this not inheritance? Which class owns the appliance references? How does SmartKitchen delegate work?

Key comparison:
Composition models HAS-A. Delegation is the action of forwarding work to the contained object.
========================================================
*/
package smartKitchen_Composition;

// SmartKitchen is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition and delegation.
public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
    public Refrigerator getIceBox() {
        return iceBox;
    }
    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee() {

        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}


class Refrigerator {

    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes() {

        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}