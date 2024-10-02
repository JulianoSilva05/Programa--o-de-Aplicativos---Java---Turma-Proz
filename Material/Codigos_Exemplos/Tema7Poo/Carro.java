public class Carro {
    String cor;
    String chassi;
    int qntPortas;
    String modelo;
    int anoFabricacao;
    String marca;
    boolean ligado;
    int velocidade;

    public void ligarCarro(){
        ligado = true;
        velocidade = 0;
    }
    public void acelerar(){
        velocidade = velocidade + 10;
    }
    public void frear(){
        velocidade = velocidade - 10;
    }
    public void desligar(){
        ligado = false;
        velocidade = 0;
    }
    public void informacoes(){
        System.out.println("Marca: " +marca);
        System.out.println("Ano de Fabricação: " +anoFabricacao);

        System.out.println("Carro está ligado: "+ ligado);
        System.out.println("Velocidade Atual: " + velocidade);
    }
}
