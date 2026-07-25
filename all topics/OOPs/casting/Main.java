/*
========================================================
TOPIC : UPCASTING, DOWNCASTING, AND instanceof
========================================================

Definition:
Upcasting stores a child object in a parent reference. Downcasting asks Java to treat that reference as a specific child type, so child-only members can be used.

Why Java provides this feature:
Programs often receive a general parent type but sometimes need specialised child behaviour safely.

Real-world analogy:
Every dog is an animal, but only after confirming an animal is a dog can you ask it to bark.

How THIS file demonstrates the topic:
This file is casting\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is the danger of downcasting? Why use instanceof? What is the difference between declared type and actual object type?

Key comparison:
Casting changes the reference view, not the object. instanceof checks the real object before a downcast.
========================================================
*/
package casting;

import java.util.Scanner;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate upcasting, downcasting, and instanceof.
public class Main {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}