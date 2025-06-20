package exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== ENTRADA DA BALADA ======");
        System.out.println("digite o seu nome");
        String nome = scanner.nextLine();
        System.out.println("digite a sua idade");
        int idade = scanner.nextInt();

        if(idade < 18){
            System.out.println("nome: " + nome + ", idade: " + idade + ", Menor de idade");
            System.out.println("Acesso negado");
        }
        if(idade >= 18){
            System.out.println("nome: " + nome + ", idade: " + idade + ", Maior de idade");
            System.out.println("Pode entrar");
        }
    }
}
