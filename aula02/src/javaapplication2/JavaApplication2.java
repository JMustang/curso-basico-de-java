package javaapplication2;

/**
 *
 * @author junior
 */
public class JavaApplication2 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "BIC Cristal";
    c1.cor = "Preta";
    c1.carga = 80;
    c1.destampar();
    c1.rabiscar();
    c1.status();
  }

}
