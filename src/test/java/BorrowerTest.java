import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("The Shining", "Stephen King", "Horror");
        library = new Library(2);
    }

    @Test
    public void canGetBorrowedBooksCount(){
        assertEquals(0, borrower.getBorrowedBooksCount());
    }

    @Test
    public void canAddBookToBorrowedBooks(){
        borrower.addBorrowedBook(book);
        assertEquals(1, borrower.getBorrowedBooksCount());
    }

    @Test
    public void canBorrowFromLibrary(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.getBorrowedBooksCount());
    }
}
