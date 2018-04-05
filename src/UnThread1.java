public class UnThread1 extends Thread{
    private int inizia=0;
    private int delta=1;
    private String mioniome="";
    Contatore conta;
    UnThread1(String nomethread,Contatore conta){
        this.mioniome=nomethread;
        this.conta=conta;
    }
    public void run(){
        for(;;){
            System.out.println("Io sono "+this.mioniome+" inizia vale: "+this.inizia+" mentre x è "+Global.x);
            System.out.println(" => il contatore vale: "+conta.getValore());
            inizia+=delta;
            conta.su();
            Global.x++;
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if(inizia>5){
                return;
            }
        }
    }
}

