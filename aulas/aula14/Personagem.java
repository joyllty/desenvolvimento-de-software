public class Personagem {
    private String nome;
    private String tipo;
    private String ataque;

    public Personagem(){

    }

    public void atacar(){
        System.out.printf("%s atacou!", getNome());
    }

    public String getNome(){
        return nome;
    }

}
