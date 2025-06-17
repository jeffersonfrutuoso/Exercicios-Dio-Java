package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
      //  6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== digite um numero ====");
        int numero = scanner.nextInt();
        double porcentagem = 0.05;
        double valorComTaxa = numero * ( 1 - porcentagem);
        System.out.println("valor de numero com reajuste de 5%: " + valorComTaxa);
    }
}
