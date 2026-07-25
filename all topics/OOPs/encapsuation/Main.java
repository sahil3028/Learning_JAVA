/*
========================================================
TOPIC : ENCAPSULATION
========================================================

Definition:
Encapsulation hides fields behind methods so an object controls how its own state changes.

Why Java provides this feature:
It stops invalid state changes, such as health becoming incorrect, and makes the class easier to maintain.

Real-world analogy:
A game player's health bar changes through game rules, not by a player directly editing a number.

How THIS file demonstrates the topic:
This file is encapsuation\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does private mean? Why use methods instead of public fields? How does this code protect health?

Key comparison:
A POJO may expose simple getters/setters; strong encapsulation also validates and protects business rules.
========================================================
*/
package encapsuation;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,
                "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}