//CLASSE
public class Carro {
    // Atributos
    String modelo;
    int ano;
    String cor;

    // Metodos
    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calcularidade() {
        return 2025 - ano;
    }
}
