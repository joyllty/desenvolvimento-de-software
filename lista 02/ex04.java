import java.util.Scanner;

/* Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n
qualquer, depois mostre na tela o índice dos elementos que são inferiores a n */
public class ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] vetor = new float[5];
        int i;
        float num;

        System.out.println("Digite 5 valores: ");


        /* Lendo os valores */
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("\nValor [%d]: ", i + 1);
            vetor[i] = input.nextFloat();
        }

        System.out.println("\nAgora digite 1 número: ");
        num= input.nextFloat();

        /* Apresentando os valores */
        for (i = 0; i < vetor.length; i++) {
            if(vetor[i] < num){
                System.out.printf("\nO número %.1f na posição [%d] é menor que %.1f", vetor[i], i + 1, num);
            }
        }

        input.close();
    }
}
