import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
