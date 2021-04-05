package aula10;
public class Aula10 {
    public static void main(String[] args) {
        Mamifero x = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        x.emitirSom();
        l.emitirSom();
        c.emitirSom();
        c.reagir("Ola");
        c.reagir("vai apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
