//Crie um programa que leia dois números e mostre a soma entre eles

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      int num1 = leitor.nextInt();

      System.out.print("Digite o segundo número: ");
      int num2 = leitor.nextInt();

      int soma = num1 + num2;

      System.out.println();

      System.out.println("Primeiro número: " + num1);
      System.out.println("Segundo número: " + num2);
      System.out.println("A soma entre os números é: " + soma);

      leitor.close();
    }
}
