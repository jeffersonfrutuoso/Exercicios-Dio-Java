package exercicios;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
//        Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
//                sabendo que o carro faz 12km com um litro.
//        Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
//        distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//                Fórmula: distância = tempo x velocidade.
//        litros usados = distância / 12.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tempo da sua viagem em Horas");
        int tempoViagem = scanner.nextInt();
        System.out.println("Qual a velocidade média da sua viagem em KM/H");
        int velocidadeViagem = scanner.nextInt();

        int distancia = tempoViagem * velocidadeViagem;
        int litrosUsados = distancia / 12;

        System.out.println("Sua distancia percorrida: " + distancia + "km");
        System.out.println("Litros Usados: " + litrosUsados + " L");

    }
}
