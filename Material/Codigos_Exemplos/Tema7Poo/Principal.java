import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int x = ler.nextInt();
        System.out.println("Digite outro numero");
        int y = ler.nextInt();
        if(x < y){
            System.out.println(x);
        }else if( x == y){
            System.out.println(x + " " + y);
        }else{
            System.out.println(y);
        }
    }
}
