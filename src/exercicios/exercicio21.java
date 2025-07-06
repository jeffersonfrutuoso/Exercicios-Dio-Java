package exercicios;

import java.util.Random;

public class exercicio21 {
    public static void main(String[] args) {
       // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
        Random numeroRandom = new Random();
        int numeroAleatorio = numeroRandom.nextInt(100);
        System.out.println("valor aleatório é: " + numeroAleatorio);
    }
}
