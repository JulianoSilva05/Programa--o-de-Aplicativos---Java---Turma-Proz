import java.util.Scanner;

public class nome_idade {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Idade: ");
        idade = leitor.nextInt();

        System.out.printf("Nome: %s \nIdade:  %d", nome, idade);

    }
}
