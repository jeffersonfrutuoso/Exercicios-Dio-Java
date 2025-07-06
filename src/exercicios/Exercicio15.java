package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate DataAtual = LocalDate.now();
        int anoAtual = DataAtual.getYear();
        int mesAtual = DataAtual.getMonthValue();
        int diaAtual = DataAtual.getDayOfMonth();

        while (true){
        System.out.println("Digite seu Nome");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = scanner.nextInt();


        System.out.print("Digite o mês em que você nasceu (1 a 12): ");
        int mesNascimento = scanner.nextInt();


        System.out.print("Digite o dia em que você nasceu (1 a 31): ");
        int diaNascimento = scanner.nextInt();

            if (anoNascimento < 1 || anoNascimento > anoAtual) {
                System.out.println("ERROR: Você digitou uma ano invalido, tente novamente");
                break;
            }
            if (mesNascimento < 1 || mesNascimento > 12) {
                System.out.println(" ERROR: Você digitou uma mês invalido, tente novamente");
                break;
            }
            if (diaNascimento < 1 || diaNascimento > 31) {
                System.out.println(" ERROR: Você digitou uma dia invalido, tente novamente");
                break;
            }
            int diasNascimento = anoNascimento * 365 + mesNascimento * 30 + diaNascimento;
            int diasAtuais = anoAtual * 365 + mesAtual * 30 + diaAtual;

            int diasVividos = diasAtuais - diasNascimento;

            int anosVividos = diasVividos /  365;
            int mesesVividos = (diasVividos % 365) / 30;
            int diasVividosNoMes = (diasVividos % 365) % 30;

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + anosVividos + " anos " + mesesVividos + " meses " + diasVividosNoMes + " dias ");
            break;
        }
    }
}
