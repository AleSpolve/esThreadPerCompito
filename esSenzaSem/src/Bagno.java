public class Bagno {
    
    String targhetta;

    public Bagno(String targhetta){

        this.targhetta=targhetta;
        
    }

    public synchronized void usa(String nome){

        System.out.println(targhetta + ":" + nome + " sta entrando nel bagno");

        try {
            
            Thread.sleep((long)(Math.random()*1000));
            } catch (Exception e) {}
                
        System.out.println(targhetta + ":" + nome + " sta uscendo dal bagno");
        
    }
}


