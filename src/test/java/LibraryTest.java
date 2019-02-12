import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
//        book1 = new Book();
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddToQueue(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

}
