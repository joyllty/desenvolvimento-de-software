public class Arqueiro extends Personagem{

    @Override
    public void atacar(){
        System.out.printf("%s disparou uma flecha encantada pelos elfos!", getNome());
    }
}
