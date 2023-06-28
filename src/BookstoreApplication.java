public class BookstoreApplication {
    public static void main(String[] args) throws BookNotFoundExceptiont {

        Book mese = new Book("Pápá pelus","Fingom Sincs",2100);
        Book vanMegMese = new Book("Viszlát cumi","Fingom Sincs Jr",2300);
        Book ameri = new Book("Amerikai Istenek","Neil Gaiman",5000);

        Bookstore store = new Bookstore();
        store.addBook(mese);
        store.addBook(vanMegMese);
        store.addBook(ameri);

        store.displayBooks();
        System.out.println(store.findBook("Pápá cumi"));

    }
}