public class CursoJava {
    public static void main(String[] args) {
        /* COMANDOS DE SAIDA */
        System.out.print("PROZ");
        System.out.println(" - A melhor escola do Brasil");
        System.out.printf("Escola: %s \nAno: %d ", "Proz", 2024);// Imprime com argumentos de formatação
        // %s - String | %d - inteiro | %f - Float
        System.out.printf("\n");
        /* COMANDO DE ENTRADA */
        // Variaveis - Antes de entrar com dados, precisamos declarar um local para
        // guardar.
        // Java é uma linguagem muito forte e muito tipada (ou seja, preciso declarar
        // variavel e tipo)
        int num = 4; // em java, é preciso inicializar a variavel. Se não iniciar, o java coloca o
                     // valor 0
        num = 50;
        System.out.printf("O valor da variavel num: %d\n", num);

        int idade = 21;
        String nome = "Juliano";
        System.out.printf("Olá, meu nome é %s, e tenho %d anos",nome,idade);
    }
}
