public class Pessoa {
    //Atributos
    String nome;
    int idade;
    double altura;
    double peso;
    //Construtor
    public Pessoa(String nome, int idade, double altura,double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
        //metodos → Ação , verbo
    public void dormir(){
        System.out.println("Zzzz");
    }
    public void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
    public void fazNiver(){
        idade = idade + 1;
    }
}
