package javaapplication2;

/**
 *
 * @author junior
 */
public class JavaApplication2 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.cor = "azul";
    c1.ponta = 0.5f;
    c1.tampada = false;
    c1.modelo = "bic";
    c1.carga = 5;
    c1.tampar();
    c1.rabiscar();
    c1.status();

    Caneta c2 = new Caneta();
    c2.modelo = "outro";
    c2.cor = "preta";
    c2.destampar();
    c2.rabiscar();
    c2.status();
  }

}
