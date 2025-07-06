package exercicios;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
//        23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
//        As informações fornecidas serão: valor da hora aula,
//        número de aulas lecionadas no mês e percentual de desconto do INSS.
//        Imprima na tela o salário líquido final.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da hora aula");
        double valorHoraAula = scanner.nextInt();
        System.out.println("Numero de horas lecionadas em um mes");
        double numeroHoras = scanner.nextInt();
        System.out.println("Percentual de desconto do inss.");
        double descontoInss = scanner.nextDouble();

        double salarioBruto = valorHoraAula * numeroHoras;
        double valorDesconto = salarioBruto * ( descontoInss / 100);

        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.println("Seu Salario liquido: " + salarioLiquido);
    }
}
