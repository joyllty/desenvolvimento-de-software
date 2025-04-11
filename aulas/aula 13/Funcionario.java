public class Funcionario extends Pessoa{
    float salario;
    String cargo;

    public Funcionario(String nome, String cpf, String cargo, float salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }
    void trabalhar(){
        System.out.println("\n| " + this.nome + " está: ");
        System.out.println("| ~ Trabalhando com " + this.cargo);
        System.out.println("| ~ Ganhando R$ " + this.salario);
    }
}
