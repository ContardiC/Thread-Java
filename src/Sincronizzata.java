public class Sincronizzata {
    public synchronized void metodoA(){
        //sezione critica
        System.out.println("Ciao da B");

    }
    public synchronized void metodoB(){
        //sezione critica
        System.out.println("Ciao da B");
    }
    /*
    Il qualificatore synchronized garantisce che
    solo un thread alla volta possa eseguire tale metodo,
    mandando gli altri in uno stato di attesa:
    l’insieme dei thread in attesa per l’utilizzo di un
    oggetto prende il nome di wait-set.
     */


    /*
    Se il metodo è lungo, potrebbe di conseguenza
    risultare lunga l’attesa degli altri
    all’ingresso del monitor: è anche possibile
    restringere la regione critica a una porzione
    del metodo mediante il costrutto:
    */
    public void metodoC(){
        synchronized (this){
            // regione critica
        }
    }
}
