package encapsulamento;

public class ContaBancaria {
    /*
     * Privite = Metodo de acesso, permite somente acesso dentro da classe que foi declarado
     */
    private String nome;
    private String cpf;
    private Double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void exibirInfo(){
        System.out.println("CPF:" + getCpf());
        System.out.println("Nome:" + getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
