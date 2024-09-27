package exemplo1;

public class Carro {
    // Criar a classe carro

    String marca;
    String modelo;
    int ano;
    double velocidade;

    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
    }

    public void buzinar() {
        System.out.println("BIIIIIIIIII!");
    }

    public void exibirInfo() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
