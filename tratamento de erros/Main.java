import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){

        System.out.print("nome: ");
        String nome = scan.nextLine();
        int idade = InputHelper.pegarNumeroInt("idade: ");
        int peso = InputHelper.pegarNumeroInt("peso: ");
        int periodo = InputHelper.pegarNumeronaRange("periodo na faculdade: ", 1, 8); 

        
            //tenta fazer a operação, se não conseguir lança um erro
            //com catch podemos ou tratar todas as exceções ou um erro especifico
           /* try{
                System.out.print("idade: ");
                int idade = Integer.parseInt(scan.nextLine());
                float peso = Float.parseFloat(scan.nextLine());

            } catch (NumberFormatException e){
                //pega o erro na variavel "e" e printa ele
                //throw new RuntimeException(e);
                System.out.println("Digite apenas números...");
                System.out.println("Digite novamente");

            } catch (Exception e){
                System.out.println(">>> ERRO <<<");
            }
            */
        }

    }
}
