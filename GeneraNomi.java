import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneraNomi {
    public void recuperaNomi() {
       
        String[] nomi = {
            "paolo", "daniele", "marco", "giusy", "maria", "stella", "roccaldo",
            "riccardo", "fabio", "giorgio", "stefano", "saverio", "cristian", "luca"
        };

  
        List<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < nomi.length; i++) {
            numeri.add(i);
        }

        Collections.shuffle(numeri);

        for (int i = 0; i < numeri.size(); i++) {
            int indice = numeri.get(i);
            System.out.println(nomi[indice]);

        }
    }

}
