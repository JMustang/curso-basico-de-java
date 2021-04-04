package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Cachorro ca = new Cachorro();
        Urubu uru = new Urubu();
        Catenga tenga = new Catenga();
        Lambreia la = new Lambreia();
        Marsupial ma = new Marsupial();
        
        ma.locomover();
        ma.emitirSom();
        ca.locomover();
        ca.emitirSom();
    }
    
}
