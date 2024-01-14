
/*

Cerință:
        Dorim să implementăm un Logger pe baza pattern-ului Chain-of-responsibility, definit în laborator, pe care îl
    vom folosi să păstram un jurnal de evenimente al unui program:
        a) Creați enumerația LogLevel, ce va acționa ca un bitwise flag, care va conține:
            - valorile - Info, Debug, Warning, Error, FunctionalMessage, FunctionalError.
            - Această enumerație va expune și o metodă statică all() care va întoarce o colecție de EnumSet<LogLevel>
            în care vor fi toate valorile de mai sus (Hint: EnumSet.allOf()).
        b) Creați o clasă abstractă LoggerBase care:
            - va primi în constructor un obiect de tip EnumSet<LogLevel> care va defini pentru ce nivele de log se va
             afisa mesajul
            - va păstra o referință către următorul LoggerBase la care se trimite mesajul
            - va expune o metodă publică setNext ce va primi un LoggerBase și va seta următorul delegat din lista
            de responsabilitate
            - va defini o metodă abstractă protected writeMessage ce va primi mesajul care trebuie afișat și afișează
            mesajul în cauză
            - va expune o metodă publică message ce va primi mesajul care trebuie afișat și o severitate de tip LogLevel (
            adică Info, Debug, Warning, Error, FunctionalMessage sau FunctionalError). Dacă instanța de logger conține
            această severitate în colecția primită în constructor, atunci se va apela metoda writeMessage. Apoi se vor
            pasa mesajul și severitatea către următorul delegat din lista de responsabilitate (dacă există unul)
        c) Definiți clasele de mai jos care vor extinde LoggerBase și implementa metoda writeMessage:
            - ConsoleLogger - care va scrie toate tipurile de LogLevel (Hint: all()) și va prefixa mesajele cu [Console]
            - EmailLogger - care va scrie doar tipurile FunctionalMessage și FunctionalError și va prefixa mesajele cu [Email]
            - FileLogger - care va scrie doar tipurile Warning și Error și va prefixa mesajele cu [File]
            Hint: EnumSet.of()
        d) Completați cele 2 TODO-uri rămase în metoda main din clasa Main.

Exemplu:
    [Console] Se execută metoda ProcessOrder()
    [Console] Comanda a fost procesată cu succes
    [Console] Datele despre adresa clientului lipsesc din baza de date a filialei
    [File] Datele despre adresa clientului lipsesc din baza de date a filialei
    [Console] Detele despre adresa clientului lipsesc din baza de date a organizație
    [File] Detele despre adresa clientului lipsesc din baza de date a organizație
    [Console] Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1
    [Email] Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1
    [Console] Comandă procesată
    [Email] Comandă procesată
 */

public class Main {
    public static void main(final String[] args) {
        // TODO: Uncomment the next 3 lines and parse the right parameters
//        LoggerBase logger1 = new ConsoleLogger();
//        LoggerBase logger2 = new EmailLogger();
//        LoggerBase logger3 = new FileLogger();

        // TODO: Build the chain of responsibility (logger1 -> logger2 -> logger3)
        // Hint: setNext() method

        // TODO: Uncomment the next 7 lines after implementing the tasks
//        logger1.message("Se execută metoda ProcessOrder()", LogLevel.Debug);
//        logger1.message("Comanda a fost procesată cu succes", LogLevel.Info);
//        logger1.message("Datele despre adresa clientului lipsesc din baza de date a filialei", LogLevel.Warning);
//        logger1.message("Detele despre adresa clientului lipsesc din baza de date a organizație", LogLevel.Error);
//        logger1.message("Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1",
//                LogLevel.FunctionalError);
//        logger1.message("Comandă procesată", LogLevel.FunctionalMessage);

    }
}