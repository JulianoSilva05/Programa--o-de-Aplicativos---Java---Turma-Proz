package Atividades;

import java.util.Scanner;
public class Tema4Atv2 {
    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        System.out.println("Sua idade: ");
        int idade = ler.nextInt();
        if(idade >=0 && idade <=12){
            System.out.println("Criança");
        }else if(idade>=13 && idade <=18){
            System.out.println("Adolescente");
        }else if(idade>=19 && idade <=59){
            System.out.println("Adulto");
        }else if(idade>=60){
            System.out.println("Idoso");
        }else{
            System.out.println("Digite um valor válido");
        }
    }
}
