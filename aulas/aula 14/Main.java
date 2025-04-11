import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Personagem[] personagens = new Personagem[3];

        personagens[0] = new Arqueiro("Thebit", 50, 20);
        personagens[1] = new Guerreiro("Rell", 70, 35);
        personagens[2] = new Mago("Soraka", 50, 25);

        for(int i = 0; i < 3; i++){
            personagens[i].atacar();
        }

        System.out.println("\n==================");
        System.out.println("\n[1] Atacar\n[2]Exibir personagens\n[3]Sair");
        System.out.println("\n==================");
        System.out.println("\n Escolha uma opção: ");
        int op = input.nextInt();
        input.nextLine();

        switch(op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }


    }

}
