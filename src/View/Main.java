package View;
import Model.Aluno;
import Model.Pessoa;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Sistema.executar();



        Aluno a = new Aluno ("joao", "j@j.com", 1234567);

        //se tiver fora do pacote nao da pra acessar
        a.setMatricula(2);



    }
}