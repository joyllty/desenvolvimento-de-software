public class Mago extends Personagem{

    @Override
    public void atacar(){
        System.out.printf("%s disparou sua magia cósmica!", getNome());
    }
}
