import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public int getBorrowedBooksCount(){
        return this.borrowedBooks.size();
    }

    public void addBorrowedBook(Book book){
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        addBorrowedBook(book);
    }
}
