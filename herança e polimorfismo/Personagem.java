public class Personagem {
    private String nome;
    private int vida;
    private int dano;

    public Personagem(String nome, int vida, int dano){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
    public void atacar() {
        System.out.printf("%s atacou!\n", getNome());
    }

    public void receberDano(int danoRecebido){
        vida -= danoRecebido;
        if(vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public String getInfo(){
        return "> Nome: " + nome + "\n" + "> Vida: " + vida + "> Dano: " + dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getDano(){
        return dano;
    }


}
  
