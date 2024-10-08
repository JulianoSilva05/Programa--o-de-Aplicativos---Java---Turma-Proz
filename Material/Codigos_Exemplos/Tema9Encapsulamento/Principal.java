public class Principal {
    public static void main(String[] args) {
        ContaBancaria cc02253 = new ContaBancaria("Juliano", "0213", 100.00);

        cc02253.depositar(50.00);
        cc02253.depositar(50.00);
        cc02253.exibirSaldo();
        cc02253.sacar(200.00);

    }
}
