public class Arqueiro extends Personagem{

    public Arqueiro(String nome, int vida, int dano){
        super(nome, vida, dano);
    }
    @Override
    public void atacar(){
        System.out.printf("%s disparou uma flecha encantada pelos elfos!\n", getNome());

    }
}
