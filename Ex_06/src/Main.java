public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1234);
        conta.setSaldo(1541.89);
        conta.titular = "Marcos";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Sald R$: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(200);
        System.out.println("Novo saldo R$: " + conta.getSaldo());
    }
}
