public class Bagno {
    
    String targhetta;
    public Semaforo semaforo;

    public Bagno(String targhetta,Semaforo semaforo){

        this.targhetta=targhetta;
        this.semaforo=semaforo;
    }

    public void usa(String nome){

        System.out.println(targhetta + ":" + nome + " sta entrando nel bagno");

        try {
            
            Thread.sleep((long)(Math.random()*1000));
            } catch (Exception e) {}
                
        System.out.println(targhetta + ":" + nome + " sta uscendo dal bagno");
        
    }
}


