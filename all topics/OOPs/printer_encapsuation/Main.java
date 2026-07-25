/*
========================================================
TOPIC : ENCAPSULATION WITH VALIDATION
========================================================

Definition:
Encapsulation keeps printer state private and changes it only through methods that apply printer rules.

Why Java provides this feature:
Toner must stay between 0 and 100, and duplex printing must count paper sheets correctly.

Real-world analogy:
A printer control panel accepts valid commands; a user cannot directly set an impossible toner level.

How THIS file demonstrates the topic:
This file is printer_encapsuation\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is tonerLevel private? How does addToner validate input? How does duplex printing change the page count?

Key comparison:
Encapsulation is not only getters/setters: it is also validation and protecting invariants.
========================================================
*/
package printer_encapsuation;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation with validation.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }
}