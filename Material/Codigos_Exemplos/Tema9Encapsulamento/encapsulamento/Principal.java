package encapsulamento;
public class Principal {
    public static void main(String[] args) {
        ContaBancaria cc0162 = new ContaBancaria();

        cc0162.setNome("Juliano");
        cc0162.setCpf("0123");
        cc0162.setSaldo(25000.00);

        cc0162.exibirInfo();
    }
}
