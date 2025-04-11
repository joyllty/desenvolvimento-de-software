public class Guerreiro extends Personagem{

    public Guerreiro (String nome, int vida, int dano){
        super(nome, vida, dano);
    }

    @Override
    public void atacar(){
        System.out.printf("%s atacou com sua espada muito afiada!\n", getNome());
    }
}
