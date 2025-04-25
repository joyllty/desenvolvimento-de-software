public class Arqueiro extends Personagem{

    public Arqueiro(String nome, int vida, int dano){
        super(nome, vida, dano);
    }
    @Override
    public void atacar(){
        System.out.print("\n«««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.printf("\n%s disparou uma flecha encantada pelos elfos!", getNome());
        System.out.print("\n«««««««««««««««««««««««««««««««««««««««««««««««««\n");

    }
}
