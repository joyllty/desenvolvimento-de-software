public class Mago extends Personagem{

    public Mago (String nome, int vida, int dano){
        super(nome, vida, dano);
    }
    @Override
    public void atacar(){
        System.out.print("\n☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼");
        System.out.printf("\n%s disparou sua magia cósmica!", getNome());
        System.out.print("\n☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼\n");
    }
}
