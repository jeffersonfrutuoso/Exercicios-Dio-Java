package exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do numero A");
        int A = scanner.nextInt();
        System.out.println("Digite o valor do numero B");
        int B = scanner.nextInt();
        System.out.println("Digite o valor do numero C");
        int C = scanner.nextInt();

       int soma = A + B;

        System.out.println("--------soma do numero A + B-------------" + soma);
       if(soma < C){
           System.out.println("a soma de  a + b ´´e menor que c");
       }else{
           System.out.println("a soma de a + b ´´e maior que c");
       }
    }
}
