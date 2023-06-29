public class BookstoreApplication {
    public static void main(String[] args) throws BookNotFoundExceptiont, InsufficientStockException {

        Book mese = new Book("Pápá pelus","Fingom Sincs",2100);
        Book vanMegMese = new Book("Viszlát cumi","Fingom Sincs Jr",2300);
        Book ameri = new Book("Amerikai Istenek","Neil Gaiman",5000);

        Bookstore store = new Bookstore();
        store.addBook(mese,4);
        store.addBook(vanMegMese,6);
        store.addBook(ameri,2);

        store.displayBooks();


        try{
            System.out.println(store.findBook("Pápá cumi"));
        }catch (BookNotFoundExceptiont exceptiont){
            System.out.println(exceptiont.getMessage());
        }
        try {

            store.sellBook("Pápá pelus", 2);
        }catch (InsufficientStockException exception){
            System.out.println(exception.getMessage());
        }

    }
}