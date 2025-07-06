package exercicios;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
      //  Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int valor = scanner.nextInt();
        for (int i = valor; i == valor; i++) {
            for (int j = 1; j < 11; j++){
                int calc =  i * j;
                System.out.println(i + " x " + j + " = " + calc);
            }
        }
    }
}
