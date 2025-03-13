import java.util.Scanner;

/* Elabore um programa que leia 5 números do teclado e os armazene em um vetor. Em seguida, leia um número n
qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor. */
public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] vetor = new float[5];
        int i, cont = 0;
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
            if(vetor[i] == num){
                cont++;
            }
        }

        System.out.printf("\nO número %.1f apareceu %d vezes!", num, cont);

        input.close();
    }
}
