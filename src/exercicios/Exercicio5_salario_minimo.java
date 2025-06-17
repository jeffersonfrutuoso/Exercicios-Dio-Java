package exercicios;

import java.util.Scanner;

public class Exercicio5_salario_minimo {
    public static void main(String[] args) {
        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        // calcule quantos salários mínimos esse
        // usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== digite um numero ====");
        int salarioMinimo = 1293;
        int salarioUsuario = scanner.nextInt();
        int calcSalarioMin = salarioUsuario / salarioMinimo;
        System.out.println("A quantidade de salarios minimos que o usuario ganha é: " + calcSalarioMin);
    }
}
