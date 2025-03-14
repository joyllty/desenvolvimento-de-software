import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        /*

        turma[0] = new Aluno();

        turma[0].nome = "Carlos";
        turma[0].nota1 = 3f;
        turma[0].nota2 = 1.0f;

        for(int i = 0; i < 5; i++){
            turma[i].verMedia();
        }
        turma[0].verMedia();

        */

        Scanner input = new Scanner(System.in);
        Aluno[] turma = new Aluno[2];
        int i;

        for(i = 0; i < turma.length; i++){
            turma[i] = new Aluno();

            System.out.println("\n------------------------");
            System.out.println("Digite sua matrícula: ");
            turma[i].matricula = input.nextInt();
            input.nextLine();

            System.out.println("Digite seu nome: ");
            turma[i].nome = input.nextLine();

            System.out.println("Digite sua nota 1: ");
            turma[i].nota1 = input.nextFloat();

            System.out.println("Digite sua nota 2: ");
            turma[i].nota2 = input.nextFloat();
        }

        for(i = 0; i < turma.length; i++){
            System.out.println("\nMatrícula: " + turma[i].matricula);
            System.out.println("Nome: " + turma[i].nome);
            System.out.println("Nota 1: " + turma[i].nota1);
            System.out.println("Nota 2: " + turma[i].nota2);

            turma[i].verMedia();

            if(turma[i].media >= 6){
                System.out.println("\nAprovado (X)Sim ( )Não");
                System.out.println("Média Final: " + turma[i].media);
            } else{
                System.out.println("\nAprovado ( )Sim (X)Não");
                System.out.println("Média Final: " + turma[i].media);
            }

        }
      
        input.close();
    }
}
