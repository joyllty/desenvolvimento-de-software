package Model;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

     public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
