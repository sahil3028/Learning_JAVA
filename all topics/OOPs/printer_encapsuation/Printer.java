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
This file is printer_encapsuation\Printer.java. It contains or uses: Printer. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Printer, addToner, printPages, getPagesPrinted. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
Why is tonerLevel private? How does addToner validate input? How does duplex printing change the page count?

Key comparison:
Encapsulation is not only getters/setters: it is also validation and protecting invariants.
========================================================
*/
package printer_encapsuation;

// Printer is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate encapsulation with validation.
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {

        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}