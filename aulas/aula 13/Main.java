public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", "0000");

        Funcionario f = new Funcionario("José", "1111", "algo", 2.0f);
        f.trabalhar();

        Cliente c = new Cliente("Maria", "2222", "maria@gmail.com");
        Cliente c2 = new Cliente("Clara", "3333", "clara@gmail.com");
        c.comprar();
        c2.comprar();

        Gerente g = new Gerente("4444", "Bruna", "maximo", 5000, 4);
        g.liderar();
        g.trabalhar();

        Vendedor v = new Vendedor("5555", "Arthur", 3000.0f, "vendedor", 6000);
        v.trabalhar();
        v.vender();

    }
}
