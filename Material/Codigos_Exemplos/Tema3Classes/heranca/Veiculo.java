package heranca;
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
}