public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("inizia il programma");

        Semaforo s1=new Semaforo(1);
        Semaforo s2=new Semaforo(1);

        Bagno bagnoUomini =new Bagno("M",s1);
        Bagno bagnoDonne =new Bagno("F",s2);

        Persona p1=new Persona("Pluto", bagnoUomini);
        Persona p2=new Persona("Ciccio", bagnoUomini);
        Persona p3=new Persona("Pippo", bagnoUomini);

        Persona p4=new Persona("Minnie", bagnoDonne);
        Persona p5=new Persona("viola", bagnoDonne);
        Persona p6=new Persona("federica", bagnoDonne);
    
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
    
        System.out.println("Tutti sono usciti dal bagno");
    }
}
