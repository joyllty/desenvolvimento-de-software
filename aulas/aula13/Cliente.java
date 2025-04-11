public class Cliente extends Pessoa{
    String email;
    public Cliente(String nome, String cpf, String email){
        super(nome, cpf);
        this.email = email;
    }

    void comprar(){
        System.out.println("\nCliente " + this.nome + " fazendo compras...");
        System.out.println("...enviar comprovante para " + this.email);
    }

}
