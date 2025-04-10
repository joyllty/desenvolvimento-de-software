import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;
//não é possível fazer herança multipla em java
//não existe herança cíclica

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("pretinha");
        cachorro.latir();
        cachorro.comer();

        //Gato gato = new Gato("safira");
        Gato gato = new Gato("safira");
        gato.miar();
        gato.lamber();
        gato.comer();

        Dragao dragao = new Dragao("syrax");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinho = new Pombo("pombo sedex");
        pombinho.enviarCartas();
        pombinho.fazerPru();

    }
}
