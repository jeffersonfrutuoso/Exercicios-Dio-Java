package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== compras online =======");
        System.out.println("Digite o nome do produto");
        String produto = scanner.nextLine();

        System.out.println("digite o valor do produto");
        int valorProduto = scanner.nextInt();

        int op = 0;
        while (op != 5){
            System.out.println("====== Formas de Pagamento ======");
        System.out.println(" 1 - À Vista em Dinheiro ou Pix");
        System.out.println(" 2 - À Vista no cartão de crédito");
        System.out.println(" 3 - Parcelado no cartão em duas vezes");
        System.out.println(" 4 - Parcelado no cartão em três vezes ou mais");
        System.out.println(" 5 - Sair");
        System.out.println("Escolha a forma de pagamento");
        op = scanner.nextInt();
        scanner.nextLine();

            if(op == 1){
                double porcentagem = 0.15;
                double valorComTaxa = valorProduto * ( 1 - porcentagem);
                System.out.println("Produto: " + produto + " Preço: " + valorComTaxa);
                break;
            }

            if(op == 2){
                double porcentagem = 0.10;
                double valorComTaxa = valorProduto * ( 1 - porcentagem);
                System.out.println("Produto: " + produto + ", Preço: " + valorComTaxa);
                break;
            }

            if(op == 3){
                System.out.println("Produto: " + produto + ", Preço: " + valorProduto);
                break;
            }

            if(op == 4){
                double porcentagem =  0.10;
                double valorComTaxa = valorProduto * ( 1 + porcentagem);
                System.out.println("Produto: " + produto + ", Preço: " + valorComTaxa);
                break;
            }
        }
    }
}
