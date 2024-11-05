import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EsercizioQuattro {
     HashMap<String, ArrayList<String>> scuola = new HashMap<>();

        public EsercizioQuattro(){

        
        aggiungiStudente(scuola, "Matematica", "Alice");
        aggiungiStudente(scuola, "Matematica", "Bob");
        aggiungiStudente(scuola, "Fisica", "Charlie");
        aggiungiStudente(scuola, "Storia", "David");
        aggiungiStudente(scuola, "Storia", "Eva");
        aggiungiStudente(scuola, "Matematica", "Frank");

        
        
    }

    
    public void aggiungiStudente(HashMap<String, ArrayList<String>> scuola, String materia, String studente) {
        
        scuola.putIfAbsent(materia, new ArrayList<>());
        
        scuola.get(materia).add(studente);
    }

    
    public void stampaStudenti(HashMap<String, ArrayList<String>> scuola) {
        System.out.println("Elenco degli studenti per ogni materia:");
        for (Map.Entry<String, ArrayList<String>> studente : scuola.entrySet()) {
            String materia = studente.getKey();
            ArrayList<String> studenti = studente.getValue();
            System.out.println(materia + ": " + studenti);
        }
    }
}
