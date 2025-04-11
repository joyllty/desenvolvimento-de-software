public class Vendedor extends Funcionario{
    float meta;

    public Vendedor(String nome, String cpf, float salario, String cargo, float meta){
        super(nome, cpf, cargo, salario);
        this.meta = meta;
    }
    public void vender(){
        System.out.println("\n| " + this.nome + " está: ");
        System.out.println("| ~ Realizando uma venda...");
        System.out.println("| ~ Possui uma meta de R$ " + this.meta);    }

}
