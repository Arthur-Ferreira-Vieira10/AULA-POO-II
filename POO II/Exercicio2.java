import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        double raio = sc.nextDouble();

        // usei 4.0 para nao dar divisao inteira (4 / 3 daria 1)
        double volume = (4.0 / 3) * (pi * Math.pow(raio, 3));

        System.out.printf("%.2f%n", volume);

        sc.close();
    }
}
