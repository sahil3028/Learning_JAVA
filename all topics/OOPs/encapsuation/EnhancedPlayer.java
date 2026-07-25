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
This file is encapsuation\EnhancedPlayer.java. It contains or uses: EnhancedPlayer. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: EnhancedPlayer, loseHealth, healthRemaining, restoreHealth. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What does private mean? Why use methods instead of public fields? How does this code protect health?

Key comparison:
A POJO may expose simple getters/setters; strong encapsulation also validates and protects business rules.
========================================================
*/
package encapsuation;

// EnhancedPlayer is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation.
public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;
    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }
    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0 ) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {

        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }
    public void restoreHealth(int extraHealth) {

        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}