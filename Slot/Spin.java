import java.util.ArrayList;
import java.util.Random;

public class Spin {
    ArrayList<ArrayList<Integer>> spin; 
    Random random; 

    public Spin() {
        spin = new ArrayList<>();
        random = new Random(); 
      

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> rullo = new ArrayList<>(); 
            for (int j = 0; j < 3; j++) {
                rullo.add(random.nextInt(5)); 
            }
            spin.add(rullo); 
        }
    }

    public void stampaSpin() {
        for (int i = 0; i < spin.size(); i++) {
            for (int j = 0; j < spin.get(i).size(); j++) { 
                System.out.print(spin.get(i).get(j) + " ");
            }
            System.out.println(""); 
        }
    }  
}