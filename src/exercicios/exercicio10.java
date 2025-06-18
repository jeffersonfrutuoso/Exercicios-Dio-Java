package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========calculo de media=========");
        System.out.println("digite a nota1");
        int nota1 = scanner.nextInt();
        System.out.println("digite a nota2");
        int nota2 = scanner.nextInt();
        System.out.println("digite a nota3");
        int nota3 = scanner.nextInt();

        int calcMedia = (nota1 + nota2 + nota3) / 3;

        System.out.println("media do aluno: " + calcMedia);
    }
}
