import java.util.Scanner;

public class InputHelper {
    static Scanner scan = new Scanner(System.in);

    public static int pegarNumeronaRange(String texto, int de, int ate){
        //quando quisermos restringir uma resposta numerica
        int num = -100;
        do{
            pegarNumeroInt(texto);
        } while(num < de || num > ate);

        return num;
    }

    public static int pegarNumeroInt(String texto){
        int num = -100;
        boolean erro = false;

        do{
            System.out.print(texto);

            try {
                num = Integer.parseInt(scan.nextLine());
                erro = false;
            } catch (NumberFormatException e) {
                erro = true;
                System.out.println("\u001B[31m>>ERRO<< \nDigite apenas números!\u001B[0m");
                //deixa o texto vermelho e retorna pra cor normal depois
            }
        } while (erro);

        return num;
    }
}
