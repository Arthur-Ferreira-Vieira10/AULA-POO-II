import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operacao = sc.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Nao e possivel dividir por zero");
                    sc.close();
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operacao invalida");
                sc.close();
                return;
        }

        System.out.println(resultado);

        sc.close();
    }
}
