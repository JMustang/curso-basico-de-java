package aula09;
public class Mamifero extends Animal{
    // Atributos
    private String corPelo;
    // Metodos
    @Override
    public void locomover() {
      //To change body of generated methods, choose Tools | Templates.
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void emitirSom() {
         System.out.println("Som de Mamifero");
//To change body of generated methods, choose Tools | Templates.
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
