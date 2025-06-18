package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========IMC===========");
        System.out.println("Digite seu Peso");
        int peso = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if(imc < 18.5 ){
            System.out.println("IMC: " + imc + " Abaixo do peso");
        }

        if (imc >= 18.6){
            if (imc <= 24.9){
                System.out.println("IMC: " + imc + " Peso ideal (parabéns)" );
            }

        }

        if (imc >= 25.0 ){
            if (imc <= 29.9){
                System.out.println("IMC: " + imc + " Levemente acima do peso" );
            }
        }

        if (imc >= 30.0){
            if (imc <= 34.9){
                System.out.println("IMC: " + imc + " Obesidade grau I" );
            }
        }

        if (imc >= 35.0){
            if (imc <= 39.9){
                System.out.println("IMC: " + imc + " Obesidade grau II (severa)" );
            }
        }

        if (imc > 40){
            System.out.println("IMC: " + imc + " Obesidade grau III (mórbida)" );
        }
    }
}
