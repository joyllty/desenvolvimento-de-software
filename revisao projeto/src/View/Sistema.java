package View;

import Controller.CadastroAlunos;
import Model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    //gerenciando as telas
    //menuzinho - interfaces do sistema

    public static void executar(){
        int op;
        Scanner scan = new Scanner(System.in);

        do{
            mostrarMenu();
            op = InputHelper.lerInt("Digite uma opção: ");
            verificarOpcao(op);
            scan.nextLine();

        } while(op != 3);
    }

    public static void mostrarMenu(){
        System.out.println("---------------");
        System.out.println("Bem Vindo!");
        System.out.println("[1] Criar Aluno");
        System.out.println("[2] Listar Alunos");
        System.out.println("[3] Sair");
        System.out.println("---------------");
    }

    public static void verificarOpcao(int op){

        switch(op){
            //cases de uma linha
            case 1 -> cadastrarAluno();
            case 2 -> listarAlunos();
            case 3 -> System.out.println("Saindo...");
            default -> System.out.println("Erro");
        }
    }

    private static void cadastrarAluno(){
        System.out.println("---------------------------");
        System.out.println("---- Cadastro de Aluno ----");

        int mat = InputHelper.lerInt(" >> Matrícula: ");
        String nome = InputHelper.lerString(" >> Nome:");
        String email = InputHelper.lerString(" >> Email:");

        /*
        //op1
        Aluno novo = new Aluno(nome, email, mat);
        CadastroAlunos.cadastrarAluno(novo);

        //op2
        CadastroAlunos.cadastrarAluno(new Aluno(nome, email, mat));
        */

        //op3
        CadastroAlunos.cadastrarAluno(nome, email, mat);

        System.out.println("---------------------------");
    }

    private static void listarAlunos(){
        System.out.println("---------------------------");
        System.out.println("----- Listando Alunos -----");

        if(CadastroAlunos.listaVazia()){
            System.out.println(" >> Nenhum aluno no sistema...");
        } else{
            /*
            //op 1
            for(int i = 0; i < CadastroAlunos.listaDeAlunos().size(); i++){
                Aluno al = CadastroAlunos.listaDeAlunos().get(i);
                System.out.println(" > " + al.getNome());
            }

            //op 2
            ArrayList<Aluno> lista = CadastroAlunos.listaDeAlunos();
            int tam = lista.size();
            for(int i = 0; i < tam; i++){
                Aluno al = lista.get(i);
                System.out.println(" > " + al.getNome());
            }
            */
            //op 3
            for (Aluno al : CadastroAlunos.listaDeAlunos()){
                System.out.println(" > " + al.getNome());
            }
        }
    }
}
