public class Produci extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti=5;
    public Produci(Semaforo s1,Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }
    public void run(){
        int k;
        for(k=0;k<tanti;k++){
            vuoto.P();
            ProdConsSem.buffer=k;
            System.out.println("Scrittore: dato scritto: "+k);
            pieno.V();
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }
}
