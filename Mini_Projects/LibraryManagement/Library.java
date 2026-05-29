package LibraryManagement;

import java.util.ArrayList;

public class Library {
    private Book book;
    private Member member;

    private ArrayList<Member> members=new ArrayList<>();
    private ArrayList<Book> books=new ArrayList<>();

    public void addBook(int bookId, int isbn, String title, String author, boolean available){
        book=new Book(bookId,isbn,title,author,available);

            for(Book b : books){
                if(b.getIsbn() == isbn){
                    System.out.println("already have that");
                    return;
                }
            }

            books.add(book);
            System.out.println("book added");

    }

    public void removeBook(int bookId, int isbn, String title, String author, boolean available){
        book=new Book(bookId,isbn,title,author,available);
        for(Book b : books){
            if(b.getIsbn() == isbn){
                books.remove(book);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book was not in the lib");
    }

    public void removeBook(int isbn){

        for(int i = 0; i < books.size(); i++){

            if(books.get(i).getIsbn() == isbn){

                books.remove(i);

                System.out.println("Book removed");
                return;
            }
        }

        System.out.println("Book was not in the lib");
    }

    public Book []searchBook(int isbn){
        for(Book book:books){
            if(book.getIsbn()==isbn){
                return new Book[]{book};
            }
        }
        return new Book[0];
    }

    public Book []searchBook(String title){
        ArrayList<Book> matchedBooks=new ArrayList<>();
        for(Book book:books){
            if(book.getTitle().equals(title)){
                matchedBooks.add(book);
            }
        }
        if (matchedBooks.isEmpty())
            return new Book[0];
        return matchedBooks.toArray(Book[]::new);
    }

    public Book[] availableBooks(){
        return books.toArray(Book[]::new);
    }

    public void registerMember(int memberId, String name, int phone){
        member=new Member(memberId,name,phone);
            members.add(member);
    }

    public void issueBook(int id, int isbn){
        boolean isThere=false;
        Member mem = null;
        Book bookFound = null;
        for(Member member:members){
            if(member.getMemberId()==id) {
                isThere = true;
                mem=member;
                break;
            }
        }
        if (!isThere){
            System.out.println("The Member is not associated");
            return;
        }
        for(Book book:books){
            if(book.getIsbn()==isbn){
                if(book.isAvailable()) {
                    isThere = false;
                    bookFound=book;
                    break;
                }
                else {
                    System.out.println("book is not available");
                    return;
                }
            }
        }
        if (isThere){
            System.out.println("book doesn't exist");
            return;
        }
        else {
            mem.borrowBook(bookFound);
            bookFound.setAvailable(false);
        }
    }

    public void returnBook(int id, int isbn){
        boolean isThere=false;
        Member mem = null;
        Book bookFound = null;
        for(Member member:members){
            if(member.getMemberId()==id) {
                isThere = true;
                mem=member;
                break;
            }
        }
        if (!isThere){
            System.out.println("The Member is not associated");
            return;
        }
        for(Book book:books){
            if(book.getIsbn()==isbn){
                if(!book.isAvailable()) {
                    isThere = false;
                    bookFound=book;
                    break;
                }
                else {
                    System.out.println("book was never issued");
                    return;
                }
            }
        }
        if (isThere){
            System.out.println("book doesn't belong here");
            return;
        }
        else {
            mem.returnBook(bookFound);
            bookFound.setAvailable(true);
        }
    }
    public void viewBorrowedBooks(){
        for(Book book:books){
            if(!book.isAvailable()){
                System.out.println(book);
            }
        }
    }

}
