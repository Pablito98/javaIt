
public class PrimaClasse {
    int altezza;
    int largezza;
    double lunghezza;
//questo è un metodo che calcola l'area
    public int area(int altezza,int largezza) {
       int risultato=altezza*largezza;
        return risultato; 

    }
 //casting implicito da int a double
   public double  somma (int altezza, double lunghezza ){
    double risultato = altezza+lunghezza;
    return risultato;
   }
   //casting da string a int
   public int convertiStringa (String prova){
    try{
    int risultato = Integer.parseInt(prova);
        return risultato;

        }
    catch(Exception ex){
            
        return 0;
    }

    
   }
}
