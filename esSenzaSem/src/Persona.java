public class Persona extends Thread{
    
    String nome;
    Bagno bagno;
    
    public Persona(String nome,Bagno bagno){
        this.nome=nome;
        this.bagno=bagno;
        
    }

    public void run(){
        
        bagno.usa(nome);
       
    }

}
