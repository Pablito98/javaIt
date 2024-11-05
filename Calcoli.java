import java.util.ArrayList;
import java.util.Scanner;


public class Calcoli {
    
    Scanner scanner = new Scanner(System.in);



    public void benvenuto(){

        System.out.println("come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Benvenuto al corso java " + nome);

    }

    public int somma(int x, int y, int z){
     int somma=x+y+z;
        return somma;
    }

    public void area(){
        System.out.println("quanto misura il raggio?");
        int raggio = scanner.nextInt();
       double calcoloArea = 3.14 * raggio * raggio;
       System.out.println("l'area è uguale a: " + calcoloArea);
       
    }

    public void areaTriangolo(){
        System.out.println("quanto misura l'altezza?");
        double altezza = scanner.nextInt();
        System.out.println("quanto misura la base?");
        double base = scanner.nextInt();
       double areaTriangolo= (base*altezza)/2;

       System.out.println("l'area è uguale a: " + areaTriangolo);
    }

    public void calcolaPerimetroQuadrato(){
        System.out.println("quanto misura il lato?");
        double lato = scanner.nextInt();
        double perimetro=lato*4;

        System.out.println("il perimetro è uguale a: " + perimetro);
        
    }

    public void calcolaRettangolo(){
        System.out.println("quanto misura la base?");
        double base = scanner.nextInt();
        System.out.println("quanto misura l'altezza?");
        double altezza = scanner.nextInt();

        double area = base*altezza;
        System.out.println(area);
        double perimetro = (base*2) + (altezza*2);
        System.out.println(perimetro);

    }

    public void calcolaAnni(){
        System.out.println("quanti anni hai?");
        int anni = scanner.nextInt();
        int conversioneAnni = anni*365;
        System.out.println(conversioneAnni);
    }

    public void controlloEta(){
        System.out.println("quanti anni hai?");
        int anni = scanner.nextInt();
        if(anni<18){
            System.out.println("sei minorenne");
        }
        else{
            System.out.println("sei maggiorenne");
        }

        
    }

    public void verificaPari(){
        System.out.println("che numero vuoi verificare?");
        int numero = scanner.nextInt();
        double controlloNumero = numero % 2;
        
        if(numero != 0){
            System.out.println("il numero è dispari");
        }else{System.out.println("il numero è pari");}
    }

    public void stampaMaggiore(){
        System.out.println("primo numero:");
        int primoNumero = scanner.nextInt();
        System.out.println("secondo numero:");
        int secondoNumero = scanner.nextInt();

        if(primoNumero<secondoNumero){
            System.out.println("il secondo numero è maggiore");
        }else{System.out.println("il primo numero è maggiore");}
    }


    public void stampaMinimo(){
        System.out.println("primo numero:");
        int primoNumero = scanner.nextInt();
        System.out.println("secondo numero:");
        int secondoNumero = scanner.nextInt();
        System.out.println("terzo numero:");
        int terzoNumero = scanner.nextInt();

        if(primoNumero<secondoNumero && primoNumero<terzoNumero){
            System.out.println("il primo numero è il piu piccolo " + primoNumero);
        }else if(secondoNumero<primoNumero && secondoNumero<terzoNumero){
            System.out.println("il secondo numero è il piu piccolo " + secondoNumero);
        }else{
            System.out.println("il terzo numero è il piu piccolo " + terzoNumero);
        }
    }

    public void verificaNumeroPositivo(){
        System.out.println("inserisci numero:");
        int numero = scanner.nextInt();
        if(numero<0){
            System.out.println("il numero è negativo");
        }else if(numero>0) {
            System.out.println("il numero è positivo");
        }else{
            System.out.println("il numero è 0");
        }
    }

    public void verificaLunghezzaParola(){
        System.out.println("scrivi una parola");
        String parola = scanner.nextLine();

        if(parola.length()>5){
            System.out.println("la parola è più lunga di 5");
        }else{
            System.out.println("la parola è meno lunga di 5");
        }
    }


    public void stampaNumeri(){
        for(int i =1; i<=20; i++){
            System.out.println(i);
        }
    }

    public void sommaPrimiNumeri(){
        System.out.println("inserisci numero:");
        int numero = scanner.nextInt();

        for(int i=0; i<=numero; i++){
        
            int somma =+ i;
            if(numero==i){
                System.out.println(somma);
            }
        }
        
    }

    public void tabellina(){
        System.out.println("inserisci numero:");
        int numero = scanner.nextInt();

        for(int i=0; i<=10; i++){
        
            int risultato = numero*i;
            
                System.out.println(risultato);
            
        }
        
    }


    public void fattoriale(){
        System.out.println("inserisci numero:");
        int numero = scanner.nextInt();
        int calcolo = 1;
        for(int i = 1; i <= numero; i++){
           calcolo*=i;
        }
        System.out.println(calcolo);

    }


    public void contoAllaRovescia(){
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
            if(i==0){
                System.out.println("buon anno!");
            }
        }
    }

    public void stampaNumeriCompresi(){
        System.out.println("inserisci numero 1:");
        int numero1 = scanner.nextInt();
        System.out.println("inserisci numero 2:");
        int numero2 = scanner.nextInt();
        
        for(int i = numero1; i <= numero2; i++){

            System.out.println(i);
        }
        

    }

     public void contaVocali(){
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
    
        stampaVocali(input);
     }

   
       
    
        public void stampaVocali(String input) {
            String vocali = "aeiouAEIOU";
            StringBuilder vocaliTrovate = new StringBuilder();
    
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (vocali.indexOf(c) != -1) {
                    vocaliTrovate.append(c).append(" ");
                }
            }
    
            if (vocaliTrovate.length() > 0) {
                System.out.println("Vocali trovate: " + vocaliTrovate.toString());
            } else {
                System.out.println("Nessuna vocale trovata nella stringa.");
            }
        }


        public void scorriArray(){
            int[][] array = {
                {0,1,2,3}, //posizione 0 
                {4,5,6,7}, // posizione 1
                {8,9,10,11}, //posizione 2
        
            };
            //con il primo for scorriamo in verticale tra i vari array interni
            for(int i=0; i<array.length;i++){
        
              //con il secondo for scorriamo in orizzontale all interno degli array 
              for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
              }
              
             // System.out.println(array[i][i]);
            }
        }

       // array di interi bidimenzionale 4x4, lo rempiamo di numeri random con massimo valore 100, e stampiamo l'array

        public void scorriArrayRandom(){
          
            int[][] array3 = {
                {0,1,2,3}, //posizione 0 
                {4,5,6,7}, // posizione 1
                {8,9,10,11}, //posizione 2
        
            };

            int[][] array = new int[4][4];


            for(int i=0; i<array.length;i++){
         
                for(int j=0; j<array[i].length;j++){

                array[i][j]=(int)(Math.random()*100);
                  System.out.print(array[i][j] + " ");
                }
            }


            for (int[] sArray : array3) {

                for(int numeri: sArray ){
                    System.out.print(numeri);
                }
            }
        }



        public void generaArray(){
            System.out.println("inserisci la prima dimensione: ");
            int primaDimensione = scanner.nextInt();
            System.out.println("inserisci la seconda dimensione: ");
            int secondaDimensione = scanner.nextInt();

            int[][] array = new int[primaDimensione][secondaDimensione];

            for (int[] sArray : array) {

                for(int numeri: sArray ){

                    numeri=(int)(Math.random()*100);

                    System.out.print(numeri + " ");
                }
            }



        }


        public void generaArrayMono(){

            System.out.println("inserisci la prima dimensione array 1: ");
            int primaDimensione = scanner.nextInt();
            System.out.println("inserisci la seconda dimensione array 2: ");
            int secondaDimensione = scanner.nextInt();

            int[] array1 = new int[primaDimensione];
            int[] array2 = new int[secondaDimensione];

            for(int i= 0 ; i<array1.length;i++){
                array1[i]=(int)(Math.random()*10);
                System.out.print(array1[i]);
            }
            System.err.println(" ");
            for(int i=0;i<array2.length;i++){
                array2[i]=(int)(Math.random()*10);
                System.out.print(array2[i]);
            }
            for(int numero3 : array1){

                for(int numero4 : array2){
                    if(numero3==numero4){
                        System.out.println(numero3);
                    }else{
                        System.out.println("i numeri non sono uguali");
                    }
                }
            }


        }

        public void generaArrayList(){

            System.out.println("inserisci nome: ");
            String nome1 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome2 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome3 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome4 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome5 = scanner.nextLine();


            ArrayList<String> nomi = new ArrayList<>();
            nomi.add(nome1);
            nomi.add(nome2);
            nomi.add(nome3);
            nomi.add(nome4);
            nomi.add(nome5);
            System.out.println("inserisci nome da cercare: ");
            String nomeDaTrovare = scanner.nextLine();
            for(int i=0; i<nomi.size();i++){
                if(nomi.get(i).equals(nomeDaTrovare)){
                    System.out.println(nomi.get(i));
                    break;
                }else if(i == nomi.size()-1){
                    
                    System.out.println("il nome non è contenuto");
                }

            }

        }

        public void rimuoviNome(){

            System.out.println("inserisci nome: ");
            String nome1 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome2 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome3 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome4 = scanner.nextLine();
            System.out.println("inserisci nome: ");
            String nome5 = scanner.nextLine();


            ArrayList<String> nomi = new ArrayList<>();
            nomi.add(nome1);
            nomi.add(nome2);
            nomi.add(nome3);
            nomi.add(nome4);
            nomi.add(nome5);
            System.out.println("inserisci nome da rimuovere: ");
            String nomeDaTrovare = scanner.nextLine();
            for (int i = 0; i < nomi.size(); i++) {
                if(nomi.get(i).equals(nomeDaTrovare)){
                    
                     nomi.remove(i);
                 }
            }
           
            
            for(int i=0; i<nomi.size();i++){
                System.out.println(nomi.get(i));
            }
        }


        public static int fibonacci(int n) {
            
            if (n <= 1) {
                return n;
            }
            
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

