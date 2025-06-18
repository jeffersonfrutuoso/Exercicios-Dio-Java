package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
//        11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
//        imprima na tela o nome do aluno e
//        se o aluno foi aprovado ou reprovado.
//        Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Aluno=========");
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("ola " + nome);
        System.out.println("digite a primeira nota de 1 a 10");
        int nota1 = scanner.nextInt();
        System.out.println("digite a segunda nota de 1 a 10");
        int nota2 = scanner.nextInt();
        System.out.println("digite a terceira nota de 1 a 10");
        int nota3 = scanner.nextInt();
        System.out.println("digite a quarta nota de 1 a 10");
        int nota4 = scanner.nextInt();

        int calcMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        if (calcMedia >= 7 ){
            System.out.println("Aluno: " + nome + ",  media: " + calcMedia + ", situaçao: aprovado");
        }

        if (calcMedia < 7 ){
            System.out.println("Aluno: " + nome + ", media: " + calcMedia + ", situaçao: reprovado");
        }

    }
}
