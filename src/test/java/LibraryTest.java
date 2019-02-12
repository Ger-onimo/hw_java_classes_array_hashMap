import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("It", "Stephen King", "Horror");
        book3 = new Book("Rebus", "Ian Rankin", "Crime");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantAddMoreThanCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canRemoveBorrowedBookFromLibrary(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canCountBooksByGenre(){
        library.addBook(book3);;
        assertEquals(1, library.getBookGenreCount("Crime"));
    }

}
