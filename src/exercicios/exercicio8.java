package exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Digite o valor de  A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de  B");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de  C");
        int c = scanner.nextInt();

        if(a >= b && a >= c){
            if ( b >= c){
                System.out.println(a + " " + b + " " + c);
            }
        }

        if(a >= b && a >= c){
            if ( c >= b){
                System.out.println(a + " " + c + " " + b);
            }
        }

        if(b >= a && b >= c){
            if ( a >= c){
                System.out.println(b + " " + a + " " + c);
            }
        }

        if(b >= a && b >= c){
            if ( c >= a){
                System.out.println(b + " " + c + " " + a);
            }
        }

        if(c >= a && c >= b){
            if ( b >= a){
                System.out.println(c + " " + b + " " + a);
            }
        }

        if(c >= a && c >= b){
            if ( a >= b){
                System.out.println(c + " " + a + " " + b);
            }
        }

    }
}
