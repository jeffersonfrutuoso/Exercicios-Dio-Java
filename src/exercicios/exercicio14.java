package exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("digite o valor de B");
        int b = scanner.nextInt();

        if (a == a) {
           int temp = a;
            temp = b;
            System.out.println("valor de a: " + temp);
        }

        if(b == b){
            int temp = b;
            temp = a;
            System.out.println("valor de b: " + temp);
        }

    }
}
