package Controller;

import Model.Aluno;
import java.util.ArrayList;

public class CadastroAlunos {

    private static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public static void cadastrarAluno(String nome, String email, int mat){
        Aluno novoAluno = new Aluno(nome, email, mat);
        listaAlunos.add(novoAluno);
    }
    public static void cadastrarAluno(Aluno novoAluno){
        listaAlunos.add(novoAluno);
    }

    public static ArrayList<Aluno> listaDeAlunos(){
        return listaAlunos;
    }

    public static boolean listaVazia(){
        return listaAlunos.isEmpty();
    }
}
