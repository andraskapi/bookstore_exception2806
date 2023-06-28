import java.util.HashMap;
import java.util.Map;

public class Bookstore {

    Map<Book, Integer> books = new HashMap<>();

    public void addBook (Book book, int quantity){
        books.put(book,quantity);
    }
    public Book findBook(String title) throws BookNotFoundExceptiont {

        for(Map.Entry<Book, Integer> entry : books.entrySet()){
            Book book = entry.getKey();
            if (entry.getKey().equals(title)){
                return book;
            }
        }
        throw new BookNotFoundExceptiont();

    }
    public void displayBooks(){
        System.out.println("Books in the Bookstore:");

        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            System.out.println(entry);
        }
    }
    public void sellBook(String title, int quantity) throws InsufficientStockException {
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            title.equals(entry.getKey());
            if(entry.getValue() < quantity){
                throw new InsufficientStockException();
            }

        }



    }
}
