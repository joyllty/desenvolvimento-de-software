import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Personagem icy = new Personagem(1, 1, "🥶");

        //Player icy = new Player(1, 2, "🥶");
        //Inimigo firy = new Inimigo(0, 4, "🥵");

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Personagem(0, 0, "🥶"));
        personagens.add(new Personagem(4, 4, "🥵"));


        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                boolean tem = false;

                for (int i = 0; i < personagens.size(); i++) {
                    if (personagens.get(i).posX == linha && personagens.get(i).posY == coluna) {
                        System.out.print("[ " + personagens.get(i).desenho + " ]");
                        tem = true;
                        break;
                    }
                }
                if (!tem) {
                    System.out.print("[ . ]");
                }
            }
            System.out.println();
        }

        do{
            System.out.print("\n----------------------");
            System.out.print("\n== Menu == \n[W] Cima\n[S] Baixo\n[A] Esquerda\n[D] Direita\nSelecione uma opção:");
            String op = input.nextLine();

            switch(op){
                case "W":
            }
            break;

        } while (true);
    }
}
