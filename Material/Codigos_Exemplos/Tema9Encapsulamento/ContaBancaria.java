public class ContaBancaria {
    String nome;
    String cpf;
    Double saldo;

    public ContaBancaria(String n, String c, Double s){
        this.nome = n;
        this.cpf = c;
        this.saldo = s;
    }

    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Você depositou R$"+ valorDeposito);
        System.out.println("Seu saldo atual é R$" + saldo);
    }
    public void sacar(Double valorSaque){
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Você sacou R$"+ valorSaque);
        }else{
            System.out.println("Saldo insuficiente\nSeu saldo atual é R$" + saldo);
        }
        System.out.println("Seu saldo atual é R$" + saldo);
    }
    public void exibirSaldo(){
        System.out.println("Saldo Atual R$"+ saldo);
    }

}
