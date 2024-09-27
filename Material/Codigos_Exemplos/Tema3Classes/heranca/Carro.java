package heranca;

public class Carro extends Veiculo {
    public int numeroPortas;
    public int cavalos;


    public void exibirInfoCar() {
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Cavalos: " + cavalos);
    }
}