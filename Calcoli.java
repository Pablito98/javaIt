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

}
