public class Guerreiro extends Personagem{

    public Guerreiro (String nome, int vida, int dano){
        super(nome, vida, dano);
    }

    @Override
    public void atacar(){
        System.out.print("\n+++++++++++++++++++++++++++++++++");
        System.out.printf("\n%s atacou com sua lança afiada!", getNome());
        System.out.print("\n+++++++++++++++++++++++++++++++++\n");
    }
}
