import java.util.ArrayList;
import java.util.List;

public class Bookstore {

    List<Book> books = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
    }
    public Book findBook(String title) throws BookNotFoundExceptiont {

        for(Book book : books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        throw new BookNotFoundExceptiont();

    }
    public void displayBooks(){
        System.out.println("Books in the Bookstore:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
