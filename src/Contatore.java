public class Contatore {
    int valore;
    int passo;
    Contatore(int valore,int passo){
        this.valore=valore;
        this.passo=passo;
        System.out.println("il contatore è nato e vale:  " + this.getValore());
    }
    void su(){
        this.valore+=this.passo;
    }
    int getValore(){
        return this.valore;
    }
}
