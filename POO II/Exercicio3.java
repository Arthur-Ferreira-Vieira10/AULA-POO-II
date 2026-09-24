import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pes = sc.nextDouble();

        // 1 pe = 30.48 cm, e 100 cm = 1 metro
        double centimetros = pes * 30.48;
        double metros = centimetros / 100;

        System.out.printf("%.2f%n", metros);

        sc.close();
    }
}
