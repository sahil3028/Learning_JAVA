package LibraryManagement;

import java.util.ArrayList;

public class Member {
    private int memberId;
    private String name;
    private int phone;
    private ArrayList<Book> borrowedBooks =new ArrayList<>();

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Member(int memberId, String name, int phone) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
    }
    public void borrowBook(Book book){
        if(borrowedBooks.contains(book)){
            System.out.println(name+" Already Borrowed this book");
            return;
        }
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        if (!borrowedBooks.contains(book)){
            System.out.println(name+" never Borrowed that");
        }
        borrowedBooks.remove(book);
    }


    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

}
