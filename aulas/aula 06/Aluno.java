public class Aluno {
    String nome;
    float nota1 = 0, nota2 = 0;
    int matricula = 0;
    float media = 0;

    float verMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);

        return media;
    }

}
