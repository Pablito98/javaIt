
import java.util.ArrayList;
import java.util.Scanner;

public class Utente {
    String id_utente;
    String nome;
    ArrayList<Film> lista_film_noleggiati;

    Scanner input= new Scanner(System.in);

    public Utente(String id_utente, String nome){
        this.id_utente=id_utente;
        this.nome=nome;
        lista_film_noleggiati= new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public String getId_utente(){
        return id_utente;
    }

    public void setNome(String nome_inserito){
        this.nome=nome_inserito;
    }
    public void setId_utente(String nuovo_id_utente){
        this.id_utente=nuovo_id_utente;
    }

    public void noleggio_film(ArrayList<Film> lista_film){
        System.out.println("QUALE FILM VUOI NOLEGGIARE?");
        for(int i=0; i<lista_film.size(); i++){
            System.out.println(lista_film.get(i).titolo);  
        }
        String titolo_film = input.nextLine();
        for(int i=0; i<lista_film.size(); i++){
            if (lista_film.get(i).titolo.equals(titolo_film)) {
                lista_film_noleggiati.add(lista_film.get(i));
            };  
        }    
        System.out.println("FILM NOLEGGIATO");

        System.out.println("SE VUOI NOLEGGIARE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            noleggio_film(lista_film);
        }
    }

    public void elimina_noleggio_film(){
        System.out.println("QUALE FILM VUOI ELIMINARE?");
        for(int i=0; i<lista_film_noleggiati.size(); i++){
            System.out.println(lista_film_noleggiati.get(i).titolo);  
        }
        String titolo_film = input.nextLine();
        for(int i=0; i<lista_film_noleggiati.size(); i++){
            if (lista_film_noleggiati.get(i).titolo.equals(titolo_film)) {
                lista_film_noleggiati.remove(lista_film_noleggiati.get(i));
            };  
        }    
        System.out.println("FILM RIMOSSO");

        System.out.println("SE VUOI RIMUOVERE ANCORA DIGITA 1 ALTRIMENTI DIGITA 2");
        int sceltaInnestata = input.nextInt();
        input.nextLine();
        if (sceltaInnestata== 1) {
            elimina_noleggio_film();
        }
    }

    public void elenco_noleggi(){
        for(int i=0; i<lista_film_noleggiati.size(); i++){
            System.out.println(lista_film_noleggiati.get(i).titolo);
        }
    }

}
