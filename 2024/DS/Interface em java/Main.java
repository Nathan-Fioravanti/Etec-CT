import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu de escolha do tipo de conta
        System.out.println("Bem-vindo ao Sistema Bancário.");
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            // Criando uma Conta Corrente
            System.out.println("Criação da Conta Corrente:");
            System.out.print("Digite o saldo inicial da conta corrente: ");
            double saldoInicialCC = scanner.nextDouble();
            System.out.print("Digite o limite do cheque especial: ");
            double limiteChequeEspecial = scanner.nextDouble();
            ContaCorrente contaCorrente = new ContaCorrente(saldoInicialCC, limiteChequeEspecial);
            System.out.println("Saldo inicial Conta Corrente: R$" + contaCorrente.getSaldo());
 
            // Operações com a Conta Corrente
            realizarOperacoesContaCorrente(contaCorrente, scanner);
 
        } else if (opcao == 2) {
            // Criando uma Conta Poupança
            System.out.println("Criação da Conta Poupança:");
            System.out.print("Digite o saldo inicial da conta poupança: ");
            double saldoInicialCP = scanner.nextDouble();
            System.out.print("Digite a taxa de rendimento mensal (%): ");
            double taxaRendimento = scanner.nextDouble();
            ContaPoupanca contaPoupanca = new ContaPoupanca(saldoInicialCP, taxaRendimento);
            System.out.println("Saldo inicial Conta Poupança: R$" + contaPoupanca.getSaldo());
 
            realizarOperacoesContaPoupanca(contaPoupanca, scanner);
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
    // Método para realizar operações da Conta Corrente
    public static void realizarOperacoesContaCorrente(ContaCorrente contaCorrente, Scanner scanner) {
        System.out.print("Digite o valor para depósito na conta corrente: ");
        double valorDepositoCC = scanner.nextDouble();
        contaCorrente.depositar(valorDepositoCC);
        System.out.print("Digite o valor para saque na conta corrente: ");
        double valorSaqueCC = scanner.nextDouble();
        contaCorrente.sacar(valorSaqueCC);
        System.out.println("Saldo atual Conta Corrente: R$" + contaCorrente.getSaldo());
    }
    // Método para realizar operações da Conta Poupança
    public static void realizarOperacoesContaPoupanca(ContaPoupanca contaPoupanca, Scanner scanner) {
        System.out.print("Digite o valor para depósito na conta poupança: ");
        double valorDepositoCP = scanner.nextDouble();
        contaPoupanca.depositar(valorDepositoCP);
        System.out.print("Digite o valor para saque na conta poupança: ");
        double valorSaqueCP = scanner.nextDouble();
        contaPoupanca.sacar(valorSaqueCP);
 
        System.out.print("Deseja aplicar o rendimento mensal? (s/n): ");
        char aplicarRendimento = scanner.next().charAt(0);
        if (aplicarRendimento == 's' || aplicarRendimento == 'S') {
            contaPoupanca.aplicarRendimento();
        }
 
        System.out.println("Saldo atual Conta Poupança: R$" + contaPoupanca.getSaldo());
    }
}