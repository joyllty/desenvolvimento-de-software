import java.util.Scanner;

/* Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. Crie um segundo
vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor */
public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, j, tam_Vetor;

        System.out.println("Quantos valores você irá digitar?: ");

        tam_Vetor = input.nextInt();

        float[] vetor = new float[tam_Vetor];
        float[] dobroVetor = new float[tam_Vetor];
        
        /* Lendo os valores e atribuindo ao vetor dobro */
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("\nValor [%d]: ", i + 1);
            vetor[i] = input.nextFloat();
            dobroVetor[i] = 2 * vetor[i];
        }

            /* Apresentando os valores */
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("\nO dobro do valor %.1f na posição [%d] é: %.1f", vetor[i], i + 1, dobroVetor[i]);
        }

        input.close();
    }
}
