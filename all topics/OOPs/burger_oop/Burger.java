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
This file is burger_oop\Burger.java. It contains or uses: Burger. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Burger, getName, getAdjustedPrice, getExtraPrice, addToppings, printItemizedList, printItem. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why does MealOrder contain Item objects? Why does DeluxeBurger extend Burger? What does @Override prove?

Key comparison:
Composition is HAS-A; inheritance is IS-A. Here both are used together.
========================================================
*/
package burger_oop;

// Burger is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition, inheritance, and polymorphism.
public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;
    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }
    public double getExtraPrice(String toppingName) {

        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }
    public void addToppings(String extra1, String extra2, String extra3) {

        this.extra1 = new Item("TOPPING", extra1,
                getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2,
                getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3,
                getExtraPrice(extra3));
    }
    public void printItemizedList() {

        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}