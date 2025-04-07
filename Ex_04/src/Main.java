
public class Main {
    public static void main(String[] args) {

        // Objeto
        Carro carro = new Carro();

        carro.modelo = "Fiat Argo";
        carro.ano = 2023;
        carro.cor = "Vermelho Vulcano";

        carro.exibirFichaTecnica();

        System.out.println("Idade do carro: " + carro.calcularidade() + " anos.");
    }
}
