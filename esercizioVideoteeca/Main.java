
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Videoteca videoteca = new Videoteca();
        Scanner input = new Scanner(System.in);
        boolean condizione = true;
        do {
            System.out.println(
                    "QUALE AZIONE VUOI SVOLGERE?\n 1)AGGIUNGI FILM\n 2)RIMUOVI FILM\n 3)CREA UTENTE\n 4)RIMUOVI UTENTE\n 5)VISUALIZZA UTENTI\n 6)GESTISCI FILM UTENTI\n 7)CHIUDI PROGRAMMA ");
            String scelta1 = input.nextLine();
            switch (scelta1) {
                // aggiungi film
                case "1":
                    videoteca.aggiungiFilm();
    
                    break;
                case "2":
                    videoteca.rimuoviFilm();
                    break;

                case "3":
                    videoteca.crea_utente();
                    break;
                case "4":
                    videoteca.rimuovi_utente();
                    break;
                case "5":
                    videoteca.visualizza_utenti();
                    break;
                case "6":
                    videoteca.gestisciFilmUtente();
                    break;
                case "7":
                    condizione=false;
                default:
                    System.out.println("NUMERO INSERITO NON VALIDO");
                    break;
            }
        } while (condizione);
        input.close();
    }
}
