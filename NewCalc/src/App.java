import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subitrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");

        int i = in.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double num1 = in.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = in.nextDouble();

        // if (i == 1) {
        // System.out.println(num1 + num2);
        // } else if (i == 2) {
        // System.out.println(num1 - num2);
        // } else if (i == 3) {
        // System.out.println(num1 * num2);
        // } else if (i == 4) {
        // System.out.println(num1 / num2);
        // } else {
        // System.out.println("Operacao invalida");
        // }

        switch (i) {
        case 1:
            // code block
            System.out.println(num1 + num2);
            break;
        case 2:
            // code block
            System.out.println(num1 - num2);
            break;
        case 3:
            // code block
            System.out.println(num1 * num2);
            break;
        case 4:
            // code block
            System.out.println(num1 / num2);
            break;
        case 5:
            // code block
            System.out.println("Operacao invalida");
            break;
        default:
        }
    }
}
