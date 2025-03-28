public class Main {
    public static void main(String[] args) {
        Player p = new Player(2, 2);

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if(linha == p.x && coluna == p.y){
                    System.out.print("[ X ]");
                } else{
                    System.out.print("[ . ]");
                }
            }
            System.out.println();
        }
    }
}
