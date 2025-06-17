package exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
//        7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palmeiras tem mundial?");
        boolean palmeirasTemMundial = scanner.nextBoolean();
        System.out.println("flamengo tem mundial?");
        boolean flamengoTemMundial = scanner.nextBoolean();

        if(palmeirasTemMundial == true && flamengoTemMundial == true){
            System.out.println("ambos sao verdadeiros");
        } else if (palmeirasTemMundial == false && flamengoTemMundial == false) {
            System.out.println("ambos sao falsos");
        }else {
            System.out.println("um é verdadeiro e o outro é falso");
        }
    }
}
