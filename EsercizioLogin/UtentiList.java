
import java.util.ArrayList;
import java.util.Scanner;

public class UtentiList {

    public ArrayList<Utente> utenti = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void home() {
        System.out.println("1 per accedere");
        System.out.println("2 per registrarsi");
        int controllo1 = scanner.nextInt();
        scanner.nextLine();
        if (controllo1 == 1) {
            //metodi per accesso
            System.out.println("inserisci il tuo nome:");
            String nome = scanner.nextLine();
            System.out.println("inserisci email:");
            String email = scanner.nextLine();
            for(int i = 0; i<=utenti.size(); i++){
                if(utenti.get(i).nome.equals(nome) && utenti.get(i).email.equals(email) ){
                    
                    System.out.println("accesso effettuato");
                    home();
                }
                else if(utenti.isEmpty() || (!utenti.get(i).nome.equals(nome) && !utenti.get(i).email.equals(email))){
                     
                    System.out.println("bisogna registrarsi!");
                    //home();
                }
            }

        } else {
            registrazione();

        }
    }

    public void registrazione() {
        System.out.println("inserisci il tuo nome:");
        String nome = scanner.nextLine();
        System.out.println("inserisci il tuo cognome:");
        String cognome = scanner.nextLine();
        System.out.println("inserisci email:");
        String email = scanner.nextLine();
        System.out.println("inserisci password:");
        String password = scanner.nextLine();

        Utente utente = new Utente(nome, cognome, email, password);
        for (int i = 0; i<=utenti.size();i++) {

            if (utenti.isEmpty()) {
                utenti.add(utente);
                System.out.println("Registrazione effettuata");
                for (Utente utente1 : utenti) {
                    System.out.println(utente1);
                }
                home();
                
            } else if (utenti.get(i).email.equals(utente.email)) {
                System.out.println("L'utente già esiste");
            }else{
                utenti.add(utente);
                System.out.println("Registrazione effettuata");
                for (Utente utente1 : utenti) {
                    System.out.println(utente1);
                }
                home();
            }
        }

    }
}
