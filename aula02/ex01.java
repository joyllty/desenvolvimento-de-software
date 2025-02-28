import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        float temp = leitor.nextFloat();

        System.out.print("Escolha a conversão: 1- Fahrenheit 2- Kelvin\nOpção: ");
        int op = leitor.nextInt();

        switch(op){
            case 1:
                float faren = ((temp * 1.8f)+ 32);
                System.out.println("Temperatura em Fahrenheit: " + faren);
                break;
            case 2:
                float kelvin = temp + 273;
                System.out.println("Temperatura em Kelvin: " + kelvin);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        leitor.close();
    }
}
