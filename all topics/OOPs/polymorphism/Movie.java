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
This file is polymorphism\Movie.java. It contains or uses: Movie, Adventure, Comedy, ScienceFiction. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Movie, watchMovie, getMovie, Adventure, Comedy, ScienceFiction. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is dynamic method dispatch? Why return Movie from getMovie? What is the role of @Override?

Key comparison:
The static factory chooses an object; overriding decides which watchMovie method runs later.
========================================================
*/
package polymorphism;

// Movie is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate polymorphism and factory method.
public class Movie {

    private String title;
    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

// Adventure extends Movie, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

// Comedy extends Movie, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

// ScienceFiction extends Movie, so this is an IS-A inheritance relationship. It can reuse accessible parent behaviour and specialise it.
class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}