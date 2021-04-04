package aula09;
public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
