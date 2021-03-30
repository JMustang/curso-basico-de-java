import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double num1, num2, soma, sub, div, mult;

        System.out.println("Insira um numero: ");
        num1 = in.nextDouble();
        System.out.println("Insira outro numero: ");
        num2 = in.nextDouble();

        mult = num1 * num2;
        div = num1 / num2;
        soma = num1 + num2;
        sub = num1 - num2;
        System.out.println("O resultado da soma e: " + soma);
        System.out.println("O resultado da Subtracao e: " + sub);
        System.out.println("O resultado da divisao e: " + div);
        System.out.println("O resultado da multiplicacao e: " + mult);
    }
}
