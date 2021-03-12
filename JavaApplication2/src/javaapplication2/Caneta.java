package javaapplication2;

/**
 *
 * @author junior
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?  " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERROR! Caneta tampada!");
        } else {
            System.out.println("Caneta destampada!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
