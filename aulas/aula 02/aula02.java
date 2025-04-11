import java.util.Scanner;

public class aula02 {

    public static void main(String[] args){
        /*
        Scanner leitor = new Scanner(System.in);
        int nota = leitor.nextInt();

        if (nota >= 9){
            System.out.println("ótimo, parabéns");
        }else if(nota >= 6){
            System.out.println("atenção");
        } else if(nota >= 5.75f){
            System.out.println("quase que deu");
        }else{
            System.out.println("só ano que vem");
        }*/

        /*Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        } else if(idade >= 16){
            System.out.println("Você pode votar!");
        } else{
            System.out.println("Você é menor de idade!");
        }

        leitor.close();*/

        Scanner leitor = new Scanner(System.in);

        System.out.print(" Digite um mes(1-12): ");
        int mes = leitor.nextInt();
        leitor.nextLine();

        switch (mes) {
            case 1:
                System.out.println("Mês " + mes + " - Janeiro");
                break;
            case 2:
                System.out.println("Mês " + mes + " - Fevereiro");
                break;
            case 3:
                System.out.println("Mês " + mes + " - Março");
                break;
            case 4:
                System.out.println("Mês " + mes + " - Abril");
                break;
            case 5:
                System.out.println("Mês " + mes + " - Maio");
                break;
            case 6:
                System.out.println("Mês " + mes + " - Junho");
                break;
            case 7:
                System.out.println("Mês " + mes + " - Julho");
                break;
            case 8:
                System.out.println("Mês " + mes + " - Agosto");
                break;
            case 9:
                System.out.println("Mês " + mes + " - Setembro");
                break;
            case 10:
                System.out.println("Mês " + mes + " - Outubro");
                break;
            case 11:
                System.out.println("Mês " + mes + " - Novembro");
                break;
            case 12:
                System.out.println("Mês " + mes + " - Dezembro");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        leitor.close();
    }
}
