
package LibraryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("""
                    
                    ========== LIBRARY MANAGEMENT SYSTEM ==========
                    1. Add Book
                    2. Remove Book
                    3. Search Book by ISBN
                    4. Search Book by Title
                    5. View Available Books
                    6. Register Member
                    7. Issue Book
                    8. Return Book
                    9. View Borrowed Books
                    10. Exit
                    ===============================================
                    """);

            System.out.print("Enter Choice: ");
            int choice = in.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = in.nextInt();

                    System.out.print("Enter ISBN: ");
                    int isbn = in.nextInt();

                    in.nextLine();

                    System.out.print("Enter Title: ");
                    String title = in.nextLine();

                    System.out.print("Enter Author: ");
                    String author = in.nextLine();

                    library.addBook(id, isbn, title, author, true);
                }

                case 2 -> {
                    System.out.print("Enter Book ID: ");
                    int id = in.nextInt();

                    System.out.print("Enter ISBN: ");
                    int isbn = in.nextInt();

                    in.nextLine();

                    System.out.print("Enter Title: ");
                    String title = in.nextLine();

                    System.out.print("Enter Author: ");
                    String author = in.nextLine();

                    library.removeBook(id, isbn, title, author, true);
                }

                case 3 -> {
                    System.out.print("Enter ISBN: ");
                    int isbn = in.nextInt();

                    Book[] books = library.searchBook(isbn);

                    if (books.length == 0) {
                        System.out.println("No Book Found");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                }

                case 4 -> {
                    in.nextLine();

                    System.out.print("Enter Title: ");
                    String title = in.nextLine();

                    Book[] books = library.searchBook(title);

                    if (books.length == 0) {
                        System.out.println("No Book Found");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                }

                case 5 -> {
                    Book[] books = library.availableBooks();

                    if (books.length == 0) {
                        System.out.println("Library Empty");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                            System.out.println();
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Enter Member ID: ");
                    int memberId = in.nextInt();

                    in.nextLine();

                    System.out.print("Enter Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Phone: ");
                    int phone = in.nextInt();

                    library.registerMember(memberId, name, phone);
                }

                case 7 -> {
                    System.out.print("Enter Member ID: ");
                    int memberId = in.nextInt();

                    System.out.print("Enter ISBN: ");
                    int isbn = in.nextInt();

                    library.issueBook(memberId, isbn);
                }

                case 8 -> {
                    System.out.print("Enter Member ID: ");
                    int memberId = in.nextInt();

                    System.out.print("Enter ISBN: ");
                    int isbn = in.nextInt();

                    library.returnBook(memberId, isbn);
                }

                case 9 -> {
                    library.viewBorrowedBooks();
                }

                case 10 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
