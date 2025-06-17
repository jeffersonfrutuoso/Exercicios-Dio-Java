package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numeroQualquer = scanner.nextInt();

        if(numeroQualquer % 2 == 0 ){
            System.out.println( numeroQualquer + " par");
        }else {
            System.out.println(numeroQualquer + " impar");
        }

        if (numeroQualquer > 0) {
            System.out.println(numeroQualquer + " positivo");
        } else if (numeroQualquer == 0) {
            System.out.println(numeroQualquer + " positivo 0");
        }else {
            System.out.println("negativo");
        }
    }
}
