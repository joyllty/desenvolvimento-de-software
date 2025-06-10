package view;

import model.Menu;
import utils.Cores;
import utils.InputHelper;

public class MenuCliente implements Menu {

    // função principal do menu cliente - sobrescrita
    @Override
    public void executar() {
        int opCliente = 0;
        do {
            menuCliente();
            opCliente= InputHelper.lerInt();
            verificarOp(opCliente);

        } while (opCliente != 3);
    }

    // ler opção do menu cliente
    public void verificarOp(int op){

        switch (op) {
            case 1 -> System.out.println("CARDÁPIO");
            case 2 -> System.out.println("CHAMANDO ATENDENTE");
            case 3 -> System.out.println("\nVoltando...");
            default -> System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + "Opção inválida!");
        }
    }

    // view menu cliente
    public static void menuCliente(){
        System.out.println("\n ╔═════════════════════════╗");
        System.out.println(" ║                         ║");
        System.out.println(" ║ [1] ABRIR CARDÁPIO      ║");
        System.out.println(" ║ [2] FAZER PEDIDO        ║");
        System.out.println(" ║ [3] VOLTAR              ║");
        System.out.println(" ║                         ║");
        System.out.println(" ╚═════════════════════════╝");

        System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Selecione uma opção: ");
    }
}