import java.util.Scanner;
public class ObterDadosTeclado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome ="";
        int idade = 0;
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        System.out.printf("Olá, meu nome é %s, e tenho %d",nome, idade);
    }
    
}
