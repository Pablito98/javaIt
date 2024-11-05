
import java.util.ArrayList;
import java.util.Scanner;

public class Videoteca {
    Scanner input = new Scanner(System.in);
    ArrayList<Film> film;
    ArrayList<Utente> lista_utenti;

    public Videoteca() {
        film = new ArrayList<>();
        lista_utenti = new ArrayList<>();
        film.add(new Film("Batman", 10));
        film.add(new Film("The Matrix", 0));
        film.add(new Film("Interstellar", 5));
        film.add(new Film("Pulp Fiction", 0));
        film.add(new Film("Forrest Gummp", 0));

        // Crea alcuni utenti con liste di film noleggiati
        Utente utente1 = new Utente("001", "Mario Rossi");
        Utente utente2 = new Utente("002", "Giulia Bianchi");
        Utente utente3 = new Utente("003", "Luca Verdi");

        // Aggiungi gli utenti all'ArrayList
        lista_utenti.add(utente1);
        lista_utenti.add(utente2);
        lista_utenti.add(utente3);

    }

    // Aggiungi i titoli alla lista
    public void aggiungiFilm() {
        System.out.println("NOME DEL FILM");
        String titolo = input.nextLine();
        System.out.println("ANNO USCITA DEL FILM");
        int anno_uscita = input.nextInt();
        input.nextLine();

        this.film.add(new Film(titolo, anno_uscita));

        System.out.println("SE VUOI AGGIUNGERE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            aggiungiFilm();
        }
    }

    // Rimuovi i titolo dalla lista
    public void rimuoviFilm() {
        System.out.println("INSERISCI IL NOME DEL FILM DA ELIMINARE");
        String titolo = input.nextLine();
        this.film.removeIf(t -> t.getTitolo().equals(titolo));

        System.out.println("SE VUOI RIMUOVERE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            rimuoviFilm();
        }
    }

    public void crea_utente() {
        System.out.println("INSERISCI ID UTENTE: ");
        String id_utente = input.nextLine();
        System.out.println("INSERISCI NOME UTENTE: ");
        String nome = input.nextLine();
        Utente utente = new Utente(id_utente, nome);
        lista_utenti.add(utente);

        System.out.println("SE VUOI CREARE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            crea_utente();
        }
    }

    public void rimuovi_utente() {
        System.out.println("INSERISCI L'ID DELL'UTENTE DA ELIMINARE");
        String id_da_eliminare = input.nextLine();
        lista_utenti.removeIf(u -> u.getId_utente().equals(id_da_eliminare));

        System.out.println("SE VUOI RIMUOVERE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            rimuovi_utente();
        }

    }

    public void visualizza_utenti() {
        for (int i = 0; i < lista_utenti.size(); i++) {
            System.out.println(lista_utenti.get(i));
        }
    }

    public void gestisciFilmUtente() {

        System.out.println("QUALE UTENTE VUOI RECUPERARE?");
        String id_utente = input.nextLine();

        for (int i = 0; i < lista_utenti.size(); i++) {
            if (lista_utenti.get(i).id_utente.equals(id_utente)) {
                lista_utenti.get(i).elenco_noleggi();

                System.out.println("QUALE OPERAZIONE VUOI FARE?");
                System.out.println("1) NOLEGGIARE FILM       2) ELIMINARE FILM ");
                int controllo = input.nextInt();
                input.nextLine();

                if (controllo == 1) {
                    
                    lista_utenti.get(i).noleggio_film(film);
                } else if (controllo == 2) {
                    lista_utenti.get(i).elimina_noleggio_film();
                } else {
                    System.out.println("ERRORE DI INPUT");
                }

            }

        }
    }
}
