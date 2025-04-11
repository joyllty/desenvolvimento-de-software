public class Guerreiro extends Personagem{

    @Override
    public void atacar(){
        System.out.printf("%s atacou com sua espada muito afiada!", getNome());
    }
}
