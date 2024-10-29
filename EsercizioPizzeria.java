import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioPizzeria {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> utenti = new ArrayList<>();
    ArrayList<String> passwordUtenti = new ArrayList<>();
    ArrayList<String> pizze = new ArrayList<>();
    ArrayList<String> bevande = new ArrayList<>();
    String admin = "admin";
    String passAdmin = "passAdmin";

    public EsercizioPizzeria() {
        // Aggiunta pizze e bevande iniziali
        pizze.add("Margherita");
        pizze.add("Diavola");
        bevande.add("Coca-Cola");
        bevande.add("Acqua");
        utenti.add(admin);
        passwordUtenti.add(passAdmin);
    }

    public void login() {
        while (true) {
            System.out.println("Per accedere inserire: 0");
            System.out.println("Per registrarsi inserire: 1");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                registrazione();
            } else if (scelta == 0) {
                accesso();
            }
        }
    }

    private void registrazione() {
        System.out.println("Inserisci nome utente:");
        String nomeUtente = scanner.nextLine();
        System.out.println("Inserisci password:");
        String passwordUtente = scanner.nextLine();
        
        utenti.add(nomeUtente);
        passwordUtenti.add(passwordUtente);
        
        System.out.println("Registrazione effettuata. Ora effettua il login.");
        accesso();
    }

    private void accesso() {
        System.out.println("Inserisci nome utente:");
        String nomeUtente = scanner.nextLine();
        System.out.println("Inserisci password:");
        String passwordUtente = scanner.nextLine();

        if (utenti.contains(nomeUtente) && passwordUtenti.contains(passwordUtente)) {
            if (nomeUtente.equals(admin) && passwordUtente.equals(passAdmin)) {
                menuAdmin();
            } else {
                menuUtente();
            }
        } else {
            System.out.println("Credenziali errate. Bisogna registrarsi.");
            login();
        }
    }

    private void menuAdmin() {
        while (true) {
            System.out.println("Benvenuto Admin!");
            System.out.println("1 - Modifica lista pizze");
            System.out.println("2 - Modifica lista bevande");
            System.out.println("3 - Torna al login");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                modificaLista(pizze, "pizze");
            } else if (scelta == 2) {
                modificaLista(bevande, "bevande");
            } else if (scelta == 3) {
                login(); // Torna al login
            }
        }
    }

    private void modificaLista(ArrayList<String> lista, String tipo) {
        System.out.println("Lista attuale delle " + tipo + ":");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }

        System.out.println("1 - Aggiungi " + tipo);
        System.out.println("2 - Modifica " + tipo + " esistente");
        System.out.println("3 - Rimuovi " + tipo);
        int scelta = scanner.nextInt();
        scanner.nextLine();

        if (scelta == 1) {
            System.out.println("Inserisci il nome della nuova " + tipo + ":");
            String nuovoElemento = scanner.nextLine();
            lista.add(nuovoElemento);
        } else if (scelta == 2) {
            System.out.println("Inserisci il codice della " + tipo + " da modificare:");
            int codice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nuovo nome:");
            String nuovoNome = scanner.nextLine();
            lista.set(codice, nuovoNome);
        } else if (scelta == 3) {
            System.out.println("Inserisci il codice della " + tipo + " da rimuovere:");
            int codice = scanner.nextInt();
            scanner.nextLine();
            lista.remove(codice);
        }
    }

    private void menuUtente() {
        ArrayList<String> ordine = new ArrayList<>();

        while (true) {
            System.out.println("Cosa desideri fare?");
            System.out.println("1 - Visualizza e ordina pizze");
            System.out.println("2 - Visualizza e ordina bevande");
            System.out.println("3 - Conferma ordine e torna al login");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                ordinaElemento(pizze, ordine, "pizza");
            } else if (scelta == 2) {
                ordinaElemento(bevande, ordine, "bevanda");
            }  else if (scelta == 3) {
                System.out.println("Ordine confermato. Torna al login.");
                login();
            }
        }
    }

    private void ordinaElemento(ArrayList<String> lista, ArrayList<String> ordine, String tipo) {
        System.out.println("Seleziona il numero della " + tipo + " che vuoi ordinare:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }

        int scelta = scanner.nextInt();
        scanner.nextLine();
        ordine.add(lista.get(scelta));
        System.out.println(tipo + " aggiunta all'ordine.");
    }
}

    

    //registrarsi si salva la registrazione e si rimanda poi al login
    // se l'user non è admin gli viene chiesto cosa vuole ordinare da una lista di pizze e bevande, può ordinare più cose finché non dice di essere ok, può vedere la lista delle cose ordinate, scrivi 1 per fare questo, 2 per fare questo e così via...
    //se admin allora può modificare la lista delle pizze e bevande che poi rimangono disponibili allo user
    //sia all'admin che all'user può venire proposto di tornare alla schermata di login e fare il login con un altro account

