public class Pessoa {

    String nome;
    String email;
    String telefone;

     Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

     Pessoa(String nome) {
        this.nome = nome;
        this.email = null;
        this.telefone = null;
    }


}
