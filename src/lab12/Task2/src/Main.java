import java.util.ArrayList;
import java.util.List;

/*
    Cerință:
        Vom realiza o mini librărie online în care putem adăuga cărți cumpărându-le  și din care putem să extragem o carte
    deja existentă.
        a) Definește clasa Book care are parametrii title, author, genre și price.
        b) Definește două noi excepții care extind clasa Exception:
            - NotEnoughMoneyException , care e aruncată atunci când utilizatorul nu are bani suficienți pentru a cumpăra
                                        o carte
            - NoSuchBookException, care e aruncată atunci când cartea dorită nu se găsește în librărie.
        c) Definește clasa OnlineLibrary care are:
            - doi parametrii: o listă de cărți și bugetul utilizatorului
            - un constructor care primește bugetul inițial al utilizatorului
            - metodele:
                - addBook - primește o carte și o adaugă în librărie dacă utilizatorul are fonduri suficiente
                - getBook - returnează cartea dorită, dacă aceasta se află în librărie.
        d) În metoda Main să se realizeze TODO-urile:
            -TODO1 - adaugă lista de cărți în librărie
            -TODO2 - ia cartea book4 din librărie. Dacă nu există, adaug-o.
        Atenție la tratarea excepțiilor! (A se afișa un mesaj corespunzător fiecărui caz, ca în exemplu).

   Exemplu:
    Added book Life of Pi
    Not enough money for Man and Boy
    Added book A little life
    Book Pride and Prejudice not available
    Added book Pride and Prejudice

 */

public class Main {
    public static void main(String[] args) {

        // TODO Uncomment after implementing the classes
//        OnlineLibrary onlineLibrary = new OnlineLibrary(150);
//
//        Book book1 = new Book("Life of Pi", "Yann Martel", "General & Literary Fiction", 40);
//        Book book2 = new Book("Man and Boy", "Tony Parson", "General & Literary Fiction", 200);
//        Book book3 = new Book("A little life", "Hanya Yanagigihara", "General & Literary Fiction", 50);
//        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 60);
//        List<Book> books = List.of(book1, book2, book3);

        // TODO Add the list of books in the library

        // TODO Get book4 from the library. If not there, add it

    }
}