//Leia Dia, Mês, Ano de nascimento de uma pessoa e imprima na tela para conferência

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      System.out.println("Digite sua data de nascimento");

      System.out.print("Dia: ");
      int dia = leitor.nextInt();

      System.out.print("Mês: ");
      int mes = leitor.nextInt();

      System.out.print("Ano: ");
      int ano = leitor.nextInt();

      System.out.println("Você nasceu no dia " + dia + " do " + mes + " de " + ano + ". Correto?");

      leitor.close();
    }
}
