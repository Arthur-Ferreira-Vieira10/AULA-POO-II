import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        // soma 1 porque o vetor comeca no 0, mas a posicao "normal" comeca no 1
        System.out.println(posicao + 1);

        sc.close();
    }
}
