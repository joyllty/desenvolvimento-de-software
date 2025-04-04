import java.util.Scanner;

public class Personagem {
    int posX; //linha
    int posY; //coluna
    String desenho; // 💀

    Personagem(int x, int y, String des){
        this.posX = x;
        this.posY = y;
        this.desenho = des;
    }


    public Personagem escolherPersonagem(Scanner input){
        System.out.println("Selecione o personagem que deseja jogar: \n[1]🥶 [2]🥵");
        int op = input.nextInt();

        switch(op){
            case 1:

                break;
            case 2:

                break;
        }
    }
}
