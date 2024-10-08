import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu de escolha do tipo de conta
        System.out.println("Bem-vindo ao Sistema Banc�rio.");
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupan�a");
        System.out.print("Digite a op��o desejada: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            // Criando uma Conta Corrente
            System.out.println("Cria��o da Conta Corrente:");
            System.out.print("Digite o saldo inicial da conta corrente: ");
            double saldoInicialCC = scanner.nextDouble();
            System.out.print("Digite o limite do cheque especial: ");
            double limiteChequeEspecial = scanner.nextDouble();
            ContaCorrente contaCorrente = new ContaCorrente(saldoInicialCC, limiteChequeEspecial);
            System.out.println("Saldo inicial Conta Corrente: R$" + contaCorrente.getSaldo());
 
            // Opera��es com a Conta Corrente
            realizarOperacoesContaCorrente(contaCorrente, scanner);
 
        } else if (opcao == 2) {
            // Criando uma Conta Poupan�a
            System.out.println("Cria��o da Conta Poupan�a:");
            System.out.print("Digite o saldo inicial da conta poupan�a: ");
            double saldoInicialCP = scanner.nextDouble();
            System.out.print("Digite a taxa de rendimento mensal (%): ");
            double taxaRendimento = scanner.nextDouble();
            ContaPoupanca contaPoupanca = new ContaPoupanca(saldoInicialCP, taxaRendimento);
            System.out.println("Saldo inicial Conta Poupan�a: R$" + contaPoupanca.getSaldo());
 
            realizarOperacoesContaPoupanca(contaPoupanca, scanner);
        } else {
            System.out.println("Op��o inv�lida.");
        }
        scanner.close();
    }
    // M�todo para realizar opera��es da Conta Corrente
    public static void realizarOperacoesContaCorrente(ContaCorrente contaCorrente, Scanner scanner) {
        System.out.print("Digite o valor para dep�sito na conta corrente: ");
        double valorDepositoCC = scanner.nextDouble();
        contaCorrente.depositar(valorDepositoCC);
        System.out.print("Digite o valor para saque na conta corrente: ");
        double valorSaqueCC = scanner.nextDouble();
        contaCorrente.sacar(valorSaqueCC);
        System.out.println("Saldo atual Conta Corrente: R$" + contaCorrente.getSaldo());
    }
    // M�todo para realizar opera��es da Conta Poupan�a
    public static void realizarOperacoesContaPoupanca(ContaPoupanca contaPoupanca, Scanner scanner) {
        System.out.print("Digite o valor para dep�sito na conta poupan�a: ");
        double valorDepositoCP = scanner.nextDouble();
        contaPoupanca.depositar(valorDepositoCP);
        System.out.print("Digite o valor para saque na conta poupan�a: ");
        double valorSaqueCP = scanner.nextDouble();
        contaPoupanca.sacar(valorSaqueCP);
 
        System.out.print("Deseja aplicar o rendimento mensal? (s/n): ");
        char aplicarRendimento = scanner.next().charAt(0);
        if (aplicarRendimento == 's' || aplicarRendimento == 'S') {
            contaPoupanca.aplicarRendimento();
        }
 
        System.out.println("Saldo atual Conta Poupan�a: R$" + contaPoupanca.getSaldo());
    }
}