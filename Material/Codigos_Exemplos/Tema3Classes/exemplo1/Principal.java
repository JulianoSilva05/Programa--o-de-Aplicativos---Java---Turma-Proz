package exemplo1;
public class Principal {

    public static void main(String[] args) {
        // Criando o objeto carro 
        Carro uno = new Carro();
        uno.marca = "Fiat";
        uno.modelo = "Mille";
        uno.ano = 2000;
        uno.velocidade = 60;

        uno.exibirInfo();
        uno.buzinar();

    }
}