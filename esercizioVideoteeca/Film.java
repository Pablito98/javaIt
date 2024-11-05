
public class Film {
    String titolo;
    int data_uscita;

    public Film(String titolo, int data_uscita){
        this.titolo= titolo;
        this.data_uscita= data_uscita;
    }
    public String getTitolo(){
        return titolo;
    }
    public int getData_uscita(){
        return data_uscita;
    }

    public void setTitolo(String titolo_inserito){
        this.titolo=titolo_inserito;
    }
    public void setData_uscita(int data_uscita_inserito){
        this.data_uscita=data_uscita_inserito;
    }

}