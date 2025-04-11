public class Gerente extends Funcionario{
    int tamanhoEquipe;
    public Gerente(String nome,String cpf, String cargo, float salario, int tamanhoEquipe){
        super(nome, cpf, cargo, salario);
        this.tamanhoEquipe = tamanhoEquipe;
    }

    void liderar(){
        System.out.println("\n> Gerente: " + this.nome);
        System.out.println("> está liderando uma equipe de " + this.tamanhoEquipe + " pessoas");
        System.out.println("> ganhando salario R$ " + this.salario);
        System.out.println("> no cargo: " + this.cargo);
    }
}
