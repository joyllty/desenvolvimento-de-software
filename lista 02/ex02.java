import java.util.Scanner;

/* Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, logo após,
mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero. */
public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, tam_Vetor;

        System.out.println("Quantos valores você irá digitar?: ");
        tam_Vetor = input.nextInt();

        int[] vetor = new int[tam_Vetor];

        System.out.printf("Digite apenas valores inteiros!");

        /* Lendo os valores */
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("\nValor [%d]: ", i + 1);
            vetor[i] = input.nextInt();
        }
        /* Apresentando os valores */
        for (i = 0; i < vetor.length; i++) {
            /* Verificação se o número é positivo, negativo ou zero */
            if (vetor[i] > 0) {
                System.out.printf("\nValor [%d]: %d é positivo!", i + 1, vetor[i]);
            } else if (vetor[i] == 0) {
                System.out.printf("\nValor [%d]: %d é igual a zero!", i + 1, vetor[i]);
            } else {
                System.out.printf("\nValor [%d]: %d é negativo!", i + 1, vetor[i]);
            }
        }

        input.close();
    }
}
