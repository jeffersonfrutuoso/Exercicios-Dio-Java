package exercicios;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        //   22 - Faça um algoritmo que leia dois valores inteiros A e B,
        //  imprima na tela o quociente e o resto da divisão inteira entre eles.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        int quociente = a / b;
        int restoDivisao = a % b;

        System.out.println("quociente deles: " + quociente);
        System.out.println("Resto da divisão: " + restoDivisao);
    }
}
