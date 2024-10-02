package Atividades;

import java.util.Scanner;

public class Tema4Atv4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        float nota = leitor.nextFloat();
        if (nota >= 0 && nota <= 19){
            System.out.println("F");
        }else if(nota >19 && nota <=49){
            System.out.println("D");
        }else if(nota > 49 && nota <= 69){
            System.out.println("C");
        }else if(nota > 69 && nota <= 89){
            System.out.println("B");
        }else if(nota >89 && nota<=100){
            System.out.println("A");
        }else{
            System.out.println("Digite uma nota válida");
        }
    }
}
