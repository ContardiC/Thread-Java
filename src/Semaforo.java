public class Semaforo {
    int valore;
    public Semaforo(int v){
        valore=v;
    }
    synchronized public void P(){
        while(valore==0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        valore--;
    }
    synchronized public void V(){
        valore++;
        notify();
    }
    /*
    l’operazione notify() segnala che si è verificata una modifica in una condizione, e lo segnala alla
    lista dei thread sospesi su quella condizione, o meglio su quell’oggetto (wait-set), in modo tale che
    uno di essi possa riprendere l’esecuzione dallo stato di attesa.
     */

}

