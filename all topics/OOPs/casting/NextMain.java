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
This file is casting\NextMain.java. It contains or uses: NextMain. Read the
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

// NextMain is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate upcasting, downcasting, and instanceof.
public class NextMain {
    // Program execution starts here. This method creates the objects and calls the behaviour that makes the OOP relationship visible.
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}