public class Aluno {
    String nome;
    float nota1, nota2;
    int idade;

    void verMedia(){
        float media = (nota1 + nota2) / 2;
        System.out.println("Média " + nome + " é: " + media);
    }

}
