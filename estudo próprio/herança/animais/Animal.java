package animais;

public class Animal {
    private String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    public void comer(){
        //<Nome> comeu
        System.out.printf("%s comeu\n", nome);
    }

    public void beber(){
        System.out.printf("%s bebeu\n", nome);
    }

    public String getNome(){
        this.nome = nome;
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
