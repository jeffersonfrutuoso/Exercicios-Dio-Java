package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== digite um numero ====");
        System.out.println("digite o numero A");
        int A = scanner.nextInt();
        System.out.println("digite o numero B");
        int B = scanner.nextInt();


        if(A == B ){
            int C = A + B;
            System.out.println(C);
        }else {
            int C = A * B;
            System.out.println(C);
        }
    }
}
