public class Mago extends Personagem{

    public Mago (String nome, int vida, int dano){
        super(nome, vida, dano);
    }
    @Override
    public void atacar(){
        System.out.printf("%s disparou sua magia cósmica!\n", getNome());
    }
}
