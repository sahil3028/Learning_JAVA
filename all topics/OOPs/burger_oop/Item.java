/*
========================================================
TOPIC : COMPOSITION, INHERITANCE, AND POLYMORPHISM
========================================================

Definition:
Composition builds a larger object from smaller objects (HAS-A). Inheritance creates specialised versions of a class (IS-A), and polymorphism lets a base reference use overridden subclass behaviour.

Why Java provides this feature:
A meal can be assembled from reusable burger, drink, side, and topping objects instead of one huge class.

Real-world analogy:
A meal order HAS-A burger, drink, and side; a DeluxeBurger IS-A Burger with extra rules.

How THIS file demonstrates the topic:
This file is burger_oop\Item.java. It contains or uses: Item. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Item, getName, getBasePrice, getAdjustedPrice, setSize, printItem. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why does MealOrder contain Item objects? Why does DeluxeBurger extend Burger? What does @Override prove?

Key comparison:
Composition is HAS-A; inheritance is IS-A. Here both are used together.
========================================================
*/
package burger_oop;

import java.util.ArrayList;

// Item is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition, inheritance, and polymorphism.
public class Item {

    private String type;
    private String name;
    private double price;
    // This private field stores size as part of this object's state. Keeping it private demonstrates encapsulation because outside code must use the class''s methods to access or change it.
    private String size = "MEDIUM";
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }
    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }
    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }
    public void setSize(String size) {
        this.size = size;
    }
    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}