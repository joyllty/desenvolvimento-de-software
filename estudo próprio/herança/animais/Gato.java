package animais;

//Gato -> subclasse
//Animal -> superclasse (classe mãe)
public class Gato extends Animal{

    //construtor
    //nesse caso, precisa passar o nome dele na hora de instanciar o objeto
    /* public Gato (String nome){
        setNome(String nome);
    }
    */
    public Gato(String nome){
        super(nome);
    }

    public void miar(){
        System.out.printf("%s miou\n", getNome());

    }
    public void lamber(){
        System.out.printf("%s lambeu\n", getNome());

    }


}
