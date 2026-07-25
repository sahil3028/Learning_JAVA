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
This file is casting\Movie.java. It contains or uses: Movie, Adventure, Comedy, ScienceFiction. Read the
comments near fields, constructors, object creation, and method calls
to connect each line with the OOP concept.

Key methods in this file: Movie, watchMovie, getMovie, Adventure, watchAdventure, Comedy, watchComedy, ScienceFiction. These methods are the best places to explain this topic in a viva.

Viva / interview focus:
What is the danger of downcasting? Why use instanceof? What is the difference between declared type and actual object type?

Key comparison:
Casting changes the reference view, not the object. instanceof checks the real object before a downcast.
========================================================
*/
package casting;

// Movie is the main study class in this file. Its declaration introduces the data and behaviour used to demonstrate upcasting, downcasting, and instanceof.
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
    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
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
    public void watchComedy() {
        System.out.println("Watching a Comedy!");
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
    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}