


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollezioniMap {

    HashMap<String, Double> prodotti = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    HashSet<String> classeA = new HashSet<>();
    HashSet<String> classeB = new HashSet<>();


    public CollezioniMap(){
        prodotti.put("mele", 1.00);
        prodotti.put("pere", 2.15);
        prodotti.put("banane", 2.30);
        classeA.add("paolo");
        classeA.add("giovanni");
        classeA.add("luca");
        classeB.add("nicola");
        classeB.add("antonio");
        classeB.add("anna");


    }

    public void cercaProdotto(){
        System.out.println("inserisci il nome del prodotto che vuoi cercare");
        String cercaProdotto = scanner.nextLine();
        for (String prodotto : prodotti.keySet()){
            if(prodotto.equals(cercaProdotto)){
                System.out.println("il prezzo di " + prodotto + " è " + prodotti.get(prodotto));
            }else{System.out.println("il prodotto non esiste");
                cercaProdotto();}
        }
    }

    public void aggiungiAlunno(){
        System.out.println("inserisci il nome che vuoi inserire");
        String inserisciPersona = scanner.nextLine();
        if(!classeA.contains(inserisciPersona)){
        classeA.add(inserisciPersona);
        } else {
            System.out.println("è gia presente nella classe A");
        }

        if(!classeB.contains(inserisciPersona)){
            classeB.add(inserisciPersona);
            } else {
                System.out.println("è gia presente nella classe B");
            }
    }

    public void verificaPresenza(){
        System.out.println("inserisci il nome che vuoi cercare");
        String cercaPersona = scanner.nextLine();
        if(classeA.contains(cercaPersona)){
            System.out.println(cercaPersona + " è presente in classe A");
        }else{
            System.out.println(cercaPersona +" non è presente");
        }

        if(classeB.contains(cercaPersona)){
            System.out.println(cercaPersona + " è presente in classe B");
        }else{
            System.out.println(cercaPersona +" non è presente");
        }



    }


}