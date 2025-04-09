package br.com.projeto.aplication;
import br.com.projeto.model.Cachorro;
import br.com.projeto.model.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranhaMoveis();
    }
}
