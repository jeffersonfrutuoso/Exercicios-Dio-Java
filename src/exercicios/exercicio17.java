package exercicios;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
//        17 - Faça um algoritmo que leia uma temperatura em Fahrenheit
//        e calcule a temperatura correspondente em grau Celsius.
//        Imprima na tela as duas temperaturas.
//        Fórmula: C = (5 * ( F-32) / 9)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma Temperatura em Fahrenheit");
        int tempFahrenheit = scanner.nextInt();
        int calc = (5* (tempFahrenheit - 32) / 9 );
        System.out.println("temperatura em Fahrenheit: " + tempFahrenheit+ "F");
        System.out.println("temperatura em graus celsius: " + calc+ "C");
    }
}
