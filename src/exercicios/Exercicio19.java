package exercicios;

public class Exercicio19 {
    public static void main(String[] args) {
        //19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++){
                int calc = i * j;
                System.out.println( i + " x " + j + " = " + calc);
            }
        }
    }
}
