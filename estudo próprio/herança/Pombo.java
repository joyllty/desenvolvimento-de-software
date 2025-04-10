package animais;

public class Pombo extends Ave{
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPru(){
        System.out.printf("%s fez pruuuuupruuu\n", getNome());
    }

    public void enviarCartas(){
        System.out.printf("%s enviou uma carta\n", getNome());
        System.out.printf("%s já enviou %d cartas\n", getNome(), cartasEnviadas);

        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

}
