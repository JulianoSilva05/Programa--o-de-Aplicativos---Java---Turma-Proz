package heranca;

//nome
public class Principal {
    public static void main(String[] args) {
        // criar objetos
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2024;
        meuCarro.numeroPortas = 4;
        meuCarro.cavalos = 125;

        meuCarro.exibirInfo();
        meuCarro.exibirInfoCar();
    }
}
