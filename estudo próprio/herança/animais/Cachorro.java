package animais;

public class Cachorro extends Animal{
    private int ossosComidos;

    //chama o construtor da classe superior
    public Cachorro(String nome){
        super(nome); //tem que ser a primeira linha do construtor
        this.ossosComidos = 10;
    }

    public void latir(){
        System.out.printf("%s latiu\n", getNome());

    }
    public void lamber(){
        System.out.printf("%s lambeu\n", getNome());

    }



}
