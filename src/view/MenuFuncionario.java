package view;

import model.Menu;
import utils.Cores;
import utils.InputHelper;

import java.util.Scanner;

public class MenuFuncionario implements Menu {

    // função principal do menu funcionário - sobrescrita
    @Override
    public void executar() {
        int opFuncionario = 0;
        do {
            menuFuncionario();
            opFuncionario= InputHelper.lerInt();
            verificarOp(opFuncionario);

        } while (opFuncionario != 4);
    }

    // ler opção do menu funcionário
    public void verificarOp(int op){

        switch (op) {
            case 1 -> System.out.println("Registrando pedido......");
            case 2 -> System.out.println("Exibir fila de pedidos.....");
            case 3 -> System.out.println("[1] CARTÃO\n[2] DINHEIRO\n[3]PIX");
            case 4 -> System.out.println("\nVoltando...");
            default -> System.out.print("\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Opção inválida!");
        }
    }

    // view menu funcionario
    public static void menuFuncionario(){
        System.out.println("\n  =======" + (Cores.LAVENDER +  " FUNCIONÁRIO " + Cores.RESET) + Cores.CREME +  "======");
        System.out.println(" ╔══════════════════════════╗");
        System.out.println(" ║                          ║");
        System.out.println(" ║ [1] REGISTRAR PEDIDOS    ║");
        System.out.println(" ║ [2] ACOMPANHAR PEDIDOS   ║");
        System.out.println(" ║ [3] PAGAMENTO            ║");
        System.out.println(" ║ [4] VOLTAR               ║");
        System.out.println(" ║                          ║");
        System.out.println(" ╚══════════════════════════╝ ");

        System.out.print(
                "\n" + (Cores.LAVENDER + ">>" + Cores.RESET) + Cores.CREME + " Selecione uma opção: ");

    }
}