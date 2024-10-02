import java.util.Scanner;

public class Tema6Exemplo3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        matriz[0][0] = 3;
        System.out.println(matriz[0][0]);
        for (int i = 0 ; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite um valor para a posição "+ i +" " + j);
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+ " ");
                
            }
        }
    }
}
