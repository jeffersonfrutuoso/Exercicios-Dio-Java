package exercicios;

public class exercicio18 {
    public static void main(String[] args) {
      //  18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m
        // e cresce 3 centímetros por ano. Faça um algoritmo que calcule
        // e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
        int alturaFrancisco = 50;
        int alturaSara = 10;
        int CrescimentoFrancisco = 2;
        int CrescimentoSara = 3;
        int anos = 0;

        while (alturaSara <= alturaFrancisco){
            alturaFrancisco += CrescimentoFrancisco;
            alturaSara += CrescimentoSara;
            anos++;
        }

        System.out.println("sara de demorou " + anos + " anos, " + " para ficar mais alto que francisco");

    }
}
