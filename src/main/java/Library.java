import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook(){
        this.books.remove(0);
        return null;
    }

    public void bookGenre(genre){
        new hashMap
        iterate over ArrayList
        find all books of the genre passed as arg
        add to total count of the genre = value
        put in hashMap
    }

}

