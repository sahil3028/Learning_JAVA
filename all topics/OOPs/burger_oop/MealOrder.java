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
This file is burger_oop\MealOrder.java. It contains or uses: MealOrder. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: MealOrder, getTotalPrice, printItemizedList, addBurgerToppings, setDrinkSize. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why does MealOrder contain Item objects? Why does DeluxeBurger extend Burger? What does @Override prove?

Key comparison:
Composition is HAS-A; inheritance is IS-A. Here both are used together.
========================================================
*/
package burger_oop;

// MealOrder is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate composition, inheritance, and polymorphism.
public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;
    public MealOrder() {
        this("regular", "coke", "fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }
    public double getTotalPrice() {

        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }
    public void printItemizedList() {

        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}