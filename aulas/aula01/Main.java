import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaração de variáveis java
        int num = 6;
        float num_real = 15.2f;
        String frase = "bom dia";
        char letra = 'b';
        boolean verdade = false;

        float soma = num + num_real;

        //print"L"n serve pra pular a linha, sem o ln ia concatenar
        System.out.println("A soma de " + num + " + " + num_real + " é: " + soma);

        //criando um objeto?
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = leitor.nextLine();

        System.out.println("Bem vindo(a) " + nome + "!");

        System.out.println("Qual é a sua idade? ");

        //acompanha o tipo de variável
        //ex, se fosse float -> leitor.nextFloat();
        int idade = leitor.nextInt();
        
        //se tiver problema com o enter no buffer, só colocar um nextLine em seguida

        leitor.close();
    }
}
