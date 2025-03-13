import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        /* Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Bruna";
        aluno1.nota1 = 8.5f;
        aluno1.nota2 = 7.3f;

        aluno2.nome = "Math";
        aluno2.nota1 = 7.0f;
        aluno2.nota2 = 9.4f;

        System.out.println(aluno1.nome);
        System.out.println(aluno1.nota1);
        System.out.println(aluno1.nota2);

        System.out.println(aluno1.nome);
        System.out.println(aluno1.nota1);
        System.out.println(aluno1.nota2); */

        Aluno[] turma = new Aluno[5];

        turma[0] = new Aluno();

        turma[0].nome = "Carlos";
        turma[0].nota1 = 3f;
        turma[0].nota2 = 1.0f;

        for(int i = 0; i < 5; i++){
            turma[i].verMedia();
        }
        turma[0].verMedia();

    }
}
