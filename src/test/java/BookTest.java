import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        Book book1;
        Book book2;
        Book book3;

        @Before
        public void before(){
            book1 = new Book("The Shining", "Stephen King", "Horror");
            book2 = new Book("It", "Stepehn King", "Horror");
            book3 = new Book("Rebus", "Ian Rankin", "Crime");
        }

        @Test
        public void canGetTitle(){
            assertEquals("The Shining", book1.getTitle());
        }

        @Test
        public void canGetAuthor(){
            assertEquals("Stephen King", book1.getAuthor());
        }

        @Test
        public void canGetGenre(){
            assertEquals("Horror", book1.getGenre());
        }

}
