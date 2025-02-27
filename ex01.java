//Peça para o usuário digitar um número e exiba esse número multiplicado por 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Bem vindo(a)!");
    System.out.println("Digite um número: ");
    int num  = leitor.nextInt();

    System.out.println("O dobro do número é: " + num * 2);

    leitor.close();
    }
}
