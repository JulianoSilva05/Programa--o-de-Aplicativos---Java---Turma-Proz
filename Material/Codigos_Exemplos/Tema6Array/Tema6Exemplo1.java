import java.util.Scanner;
public class Tema6Exemplo1{
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 numeros: ");
        for(int i =0; i<=4; i++){
            numeros[i] = ler.nextInt();
        }
        for(int i =0; i<=4; i++){
            System.out.println(i+1 + "º - " + numeros[i]);
        }
    }
}