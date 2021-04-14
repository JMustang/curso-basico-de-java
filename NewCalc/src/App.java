import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = 0;
        double num1, num2, res;

        do {

            num1 = num2 = res = 0;

            System.out.println(" 1 - somar");
            System.out.println(" 2 - subitrair");
            System.out.println(" 3 - multiplicar");
            System.out.println(" 4 - dividir");
            System.out.println(" 0 - sair");

            System.out.println("Digite o codigo da operacao");
            x = in.nextInt();

            if (x != 0) {
                System.out.println("Digite o primeiro numero ");
                num1 = in.nextDouble();

                System.out.println("Digite o primeiro numero ");
                num2 = in.nextDouble();

                if (x == 1) {
                    res = num1 + num2;
                } else if (x == 2) {
                    res = num1 - num2;
                } else if (x == 3) {
                    res = num1 * num2;
                } else if (x == 4) {
                    res = num1 / num2;
                }
                System.out.println("____________");
                System.out.println("O resultado foi " + res);
                System.out.println("____________");
            }
        } while (x != 0);

    }

}
