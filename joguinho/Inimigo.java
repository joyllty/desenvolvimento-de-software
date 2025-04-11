public class Inimigo extends Personagem{
    int posX, posY;
    String desenho;

    Inimigo(int x, int y, String des){
        super(x, y, des); //passa as informações para a classe personagem
                            // sempre vai chamar o construtor da classe de cima
    }
}
