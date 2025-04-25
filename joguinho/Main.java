import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Personagem[] personagens = new Personagem[3];

    public static void main(String[] args) {

        personagens[0] = new Arqueiro("Thebit", 50, 20);
        personagens[1] = new Guerreiro("Rell", 70, 35);
        personagens[2] = new Mago("Soraka", 50, 25);

        /*for (int i = 0; i < personagens.length; i++) {
            personagens[i].atacar();
        }
        */
        int op;
        do {
            System.out.println("\n=========================");
            System.out.println("[1] Atacar\n[2] Exibir personagens\n[3] Editar personagens\n[4] Sair");
            System.out.println("=========================");
            System.out.println("> O que deseja fazer?: ");
            op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    realizarAtaque();
                    break;
                case 2:
                    for (int i = 0; i < personagens.length; i++) {
                        System.out.println("\n-----Personagem[" + (i+1) +"]" + "-----");
                        System.out.println("Nome: " + personagens[i].getNome());
                        System.out.println("Vida: " + personagens[i].getVida());
                        System.out.println("Dano: " + personagens[i].getDano());
                        System.out.println("-----------------------");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente: ");

            }
        } while (op != 3);
    }
        public static void realizarAtaque(){
            int indiceAtacante = escolherPersonagem("\nEscolha o personagem que vai atacar -> [1 a 3] \nVoltar ao menu -> [0]:");
            if(indiceAtacante == -1){
                return;
            }
            int indiceAlvo = escolherPersonagem("Escolha o alvo -> [1 a 3]: ");

            if(indiceAtacante == indiceAlvo){
                System.out.println("Um personagem não pode atacar a si mesmo!");
            }

            Personagem atacante = personagens[indiceAtacante];
            Personagem alvo = personagens[indiceAlvo];

            if(!atacante.estaVivo()){
                System.out.println("O personagem com que deseja atacar está morto!");
            }

            if(!alvo.estaVivo()){
                System.out.println("O alvo já está morto!");
            }

            atacante.atacar();
            alvo.receberDano(atacante.getDano());

            System.out.printf("\n> %s causou [%d] de dano em %s. \n> Vida restante do alvo: [%d]\n", atacante.getNome(), atacante.getDano(), alvo.getNome(), alvo.getVida());

            if(!alvo.estaVivo()){
                System.out.println("> " + alvo.getNome() + " foi derrotado!");
            }
        }

        public static int escolherPersonagem(String mensagem) {
            int escolha;
            do{
                System.out.println(mensagem);
                escolha = input.nextInt();

                if(escolha == 0){
                    return -1;
                }
            } while (escolha < 1 || escolha > 3);

            return escolha - 1;
        }

        /*public static void editarPersonagem(){
            System.out.println("");

        }
         */
}
