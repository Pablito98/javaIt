import java.util.Scanner;  //importante importare per utilizzare lo scanner

public class ProvaScanner {
    public static void main(String[] args) {
        //utilizzo scanner per input esterni
   Scanner scanner = new Scanner(System.in);
   Scanner scannerNumero = new Scanner(System.in);
   System.out.println("come ti chiami?");
   String nome = scanner.nextLine();
   System.out.println("Ciao" + nome);
   System.out.println("quanti anni hai?");
   int anni = scannerNumero.nextInt();
   System.out.println("ti chiami "+ nome + " e hai "+ anni + " anni");
    }
}
