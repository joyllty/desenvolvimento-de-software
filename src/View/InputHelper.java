package View;

import java.util.Scanner;

public class InputHelper {

    static Scanner scan = new Scanner(System.in);

    public static int lerInt(String texto){
        System.out.println(texto);
        int num = Integer.parseInt(scan.nextLine());
        return num;
    }

    public static String lerString(String texto){
        System.out.println(texto);
        String txt = scan.nextLine();
        return txt;
    }

}
