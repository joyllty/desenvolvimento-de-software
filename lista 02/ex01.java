import java.util.Scanner;

/* Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a
média destes valores em um outro vetor, e depois apresente na tela quais valores são menores, iguais ou
superiores à média. */
public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] vetor = new float[5];
        float soma = 0;
        float media = 0;
        int i;


        System.out.println("Digite 5 valores: ");

        for (i = 0; i < vetor.length; i++) {
            System.out.printf("Valor [%d]: ", i + 1);
            vetor[i] = input.nextFloat();
        }

        for (i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / 5;

        System.out.println("A média dos valores digitados é: " + media);

        for (i = 0; i < length; i++) {
            if (media < vetor[i]){
                System.out.printf("\nO valor %.1f é superior à média! ", vetor[i]);
            } else if (media == vetor[i]){
                System.out.printf("\nO valor %.1f é igual a média! ", vetor[i]);
            } else {
                System.out.printf("\nO valor %.1f é inferior à média! ", vetor[i]);
            }

        }
    }
}
