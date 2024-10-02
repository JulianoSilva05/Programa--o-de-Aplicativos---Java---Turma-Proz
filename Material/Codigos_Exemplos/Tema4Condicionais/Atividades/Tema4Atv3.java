package Atividades;

import java.util.Scanner;

public class Tema4Atv3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seu peso: (XX,XX)");
        float peso = teclado.nextFloat();
        System.out.println("Sua altura, (X,XX)");
        float altura = teclado.nextFloat();
        float imc = peso / (altura*altura);
        System.out.println(imc);
        if(imc<=18.4){
            System.out.println("Abaixo do peso");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println("Peso normal");
        }else if(imc > 24.9){
            System.out.println("Acima do peso");
        }
    }
}
