package view;

import model.Menu;
import utils.Cores;
import utils.InputHelper;

public class MenuGerente implements Menu {

    // função principal do menu gerência - sobrescrita
    @Override
    public void executar() {
        int opGerente = 0;
        do {
            menuGerente();
            opGerente= InputHelper.lerInt();
            verificarOp(opGerente);

        } while (opGerente != 4);
    }

    // ler opção do menu gerência
    public void verificarOp(int op){

        switch (op) {
            case 1 -> menuGerentePedidos();
            case 2 -> new view.EstoqueView().executar(); // cria um objeto para chamar o metodo executar, que não é static
            case 3 -> menuGerenteGerenciamento();
            case 4 -> System.out.println("\nVoltando...");
            default -> System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Opção inválida!");
        }
    }

    // view menu gerência
    public static void menuGerente() {
        System.out.println("\n ╔══════════════════════════╗");
        System.out.println(" ║                          ║");
        System.out.println(" ║ [1] PEDIDOS              ║");
        System.out.println(" ║ [2] ESTOQUE              ║");
        System.out.println(" ║ [3] GERENCIAMENTO        ║");
        System.out.println(" ║ [4] VOLTAR               ║");
        System.out.println(" ║                          ║");
        System.out.println(" ╚══════════════════════════╝ ");

        System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Selecione uma opção: ");
    }


    // view menu gerência - pedidos
    public static void menuGerentePedidos() {
        int opPedidosG;
        do {
            System.out.println("\n ╔══════════════════════════╗");
            System.out.println(" ║                          ║");
            System.out.println(" ║ [1] REGISTRAR PEDIDOS    ║");
            System.out.println(" ║ [2] ACOMPANHAR PEDIDOS   ║");
            System.out.println(" ║ [3] REMOVER PEDIDOS      ║");
            System.out.println(" ║ [4] PAGAMENTO            ║");
            System.out.println(" ║ [5] VOLTAR               ║");
            System.out.println(" ║                          ║");
            System.out.println(" ╚══════════════════════════╝ ");

            System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Selecione uma opção: ");
            opPedidosG = InputHelper.lerInt();

            switch (opPedidosG) {
                case 1:
                    System.out.println("Registrando pedido......");
                    break;
                case 2:
                    System.out.println("Exibir fila de pedidos.....");
                    break;
                case 3:
                    System.out.println("Buscar pedido por numero e remover");
                    break;
                case 4:
                    System.out.println("[1] CARTÃO\n[2] DINHEIRO\n[3]PIX");
                    break;
                case 5:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Opção inválida!");
            }

        } while (opPedidosG != 5);
    }

    // view menu gerência - gerenciamento
    public static void menuGerenteGerenciamento () {
        int opGerencia;
        do {
            System.out.println("\n ╔═══════════════════════════╗");
            System.out.println(" ║                           ║");
            System.out.println(" ║ [1] EXIBIR FUNCIONÁRIOS   ║");
            System.out.println(" ║ [2] HISTÓRICO DE VENDAS   ║");
            System.out.println(" ║ [3] VOLTAR                ║");
            System.out.println(" ║                           ║");
            System.out.println(" ╚═══════════════════════════╝ ");

            System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Selecione uma opção: ");
            opGerencia = InputHelper.lerInt();

            switch (opGerencia) {
                case 1 -> System.out.println("\n============" + (Cores.LAVENDER + " FUNCIONÁRIOS " + Cores.RESET) +
                        Cores.CREME + "============");
                case 2 -> System.out.println("\n============" + (Cores.LAVENDER + " HISTÓRICO VENDAS " + Cores.RESET) +
                        Cores.CREME + "============");
                case 3 -> System.out.println("\nVoltando...");

            }
        } while (opGerencia != 3);
    }

}