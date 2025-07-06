package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
//        16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
//        e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Lado A");
        int ladoA = scanner.nextInt();
        System.out.println("Digite o Lado b");
        int ladoB = scanner.nextInt();
        System.out.println("Digite o Lado C");
        int ladoC = scanner.nextInt();

        int calcTrianguloAeB = ladoA + ladoB;
        int calcTrianguloAeC = ladoA + ladoC;
        int calcTrianguloBeC = ladoB + ladoC;
        boolean isTriangule;

        if(calcTrianguloAeB > ladoC && calcTrianguloAeC > ladoB && calcTrianguloBeC > ladoA){
            isTriangule = true;
            System.out.println("é um triangulo");
        }else {
            isTriangule = false;
            System.out.println("Não é um triangulo");
        }

        //Triângulo Equilátero ,Todos os três lados são iguais.
        //Triângulo Isósceles, Dois lados são iguais e o terceiro é diferente.
        //Triângulo Escaleno, Todos os três lados são diferentes uns dos outros.
        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
            System.out.println("Triângulo Equilátero");
        }if (isTriangule == true){
            if (ladoA == ladoB && ladoA != ladoC ||
                    ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA)
            System.out.println("Triângulo Isósceles");
        }if (isTriangule == true){
            if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("Triângulo Escaleno");
            }
        }

    }
}
