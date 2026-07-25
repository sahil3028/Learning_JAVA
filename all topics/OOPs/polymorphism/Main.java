/*
========================================================
TOPIC : POLYMORPHISM AND FACTORY METHOD
========================================================

Definition:
Polymorphism allows a Movie reference to hold Adventure, Comedy, or ScienceFiction objects and call their own watchMovie implementation.

Why Java provides this feature:
The calling code does not need separate variables or separate watch logic for every movie subtype.

Real-world analogy:
One Play button starts different kinds of films, each with its own scenes.

How THIS file demonstrates the topic:
This file is polymorphism\Main.java. It contains or uses: Main. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: main. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is dynamic method dispatch? Why return Movie from getMovie? What is the role of @Override?

Key comparison:
The static factory chooses an object; overriding decides which watchMovie method runs later.
========================================================
*/
package polymorphism;

import java.util.Scanner;

// Main is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate polymorphism and factory method.
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