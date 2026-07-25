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
This file is burger_oop\DeluxeBurger.java. It contains or uses: DeluxeBurger. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: DeluxeBurger, addToppings, printItemizedList, getExtraPrice. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why does MealOrder contain Item objects? Why does DeluxeBurger extend Burger? What does @Override prove?

Key comparison:
Composition is HAS-A; inheritance is IS-A. Here both are used together.
========================================================
*/
package burger_oop;

// DeluxeBurger is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition, inheritance, and polymorphism.
public class DeluxeBurger extends Burger {

    Item deluxe1;
    Item deluxe2;
    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item("TOPPING", extra4, 0);
        deluxe2 = new Item("TOPPING", extra5, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}