public class ProdConsSem {
    protected static int buffer; // variabile globale condivisa
    public static void main(String args[]){
        Semaforo pieno=new Semaforo(0);
        Semaforo vuoto=new Semaforo(1);
        Produci produci=new Produci(pieno,vuoto);
        Consuma consuma=new Consuma(pieno,vuoto);
        produci.start();
        consuma.start();
    }

}
