public class PrimeVariabili {

    public static void main(String[] args) {

    //nomero intero
    int numero = 0;
    //vero o falso
    boolean corretto = true;
    //numero decimale molto grande
    float numeroDecimaleGrande = 0.5453432525f;
    //numero decimale
    double numeroDecimale = 0.7;
    //singolo carattere
    char carattere = 'a';
    //tipo non primittivo perchè composto da piu char
    String nome = "Paolo";

    final int numeroCostante = 2;


        //somma variabili stesso diverso tipo
        System.out.println(numero+numeroCostante);
        //somma stringa
        System.out.println(nome + "Mariano");
        //somma string e altro tipo
        System.out.println(nome + numeroDecimale);
        //
        System.out.println();
        //
        System.out.println();

    }
}
