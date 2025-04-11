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

    public int receberDano(){
        this.vida -= this.dano;
        return vida;
    }
    public boolean estaVivo(){
        boolean vivo;
        if(receberDano() < 0){
            System.out.printf("\n%s MORREU", getNome());
            return vivo = false;
        } else {
            return vivo = true;
        }
    }

    public String getInfo(){
        return "> Nome: " + nome + "\n" + "> Vida: " + vida + "> Dano: " + dano;
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
