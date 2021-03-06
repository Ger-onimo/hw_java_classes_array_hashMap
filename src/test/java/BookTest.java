import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        private Book book;

        @Before
        public void before(){
            book = new Book("The Shining", "Stephen King", "Horror");
        }

        @Test
        public void canGetTitle(){
            assertEquals("The Shining", book.getTitle());
        }

        @Test
        public void canGetAuthor(){
            assertEquals("Stephen King", book.getAuthor());
        }

        @Test
        public void canGetGenre(){
            assertEquals("Horror", book.getGenre());
        }

}
