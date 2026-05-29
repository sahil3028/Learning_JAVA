package LibraryManagement;

public class Book {
    private int bookId,isbn;
    private String title,author;
    private boolean available;

    public Book(int bookId, int isbn, String title, String author, boolean available) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return String.format(
                "📖 Book Details\n" +
                        "   ├── ID:        %d\n" +
                        "   ├── ISBN:      %d\n" +
                        "   ├── Title:     \"%s\"\n" +
                        "   ├── Author:    %s\n" +
                        "   └── Status:    %s",
                bookId, isbn, title, author, (available ? "🟢 Available" : "🔴 Checked Out")
        );
    }

}
