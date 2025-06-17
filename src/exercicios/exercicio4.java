package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== digite um numero ====");
        int num = scanner.nextInt();

        int antecessor = num;
        int sucessor = num;

        if(num == num) {
            sucessor++;
            antecessor--;
            System.out.println("sucessor de " + num + " = " + sucessor);
            System.out.println("Antecessor de " + num + " = " + antecessor);
        }
    }
}
