public class Global {

    protected static int x=100;
    public static void main(String args[]){
        Contatore conta=new Contatore(0,1);
        Thread thr1=new UnThread1("Ali",conta);
        Thread thr2=new UnThread1("Baba",conta);
        thr1.start();
        thr2.start();
    }
}
