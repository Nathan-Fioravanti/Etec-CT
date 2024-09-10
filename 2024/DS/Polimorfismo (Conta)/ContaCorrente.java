
public class ContaCorrente extends Conta {
    private double tarifaMensal;
 
    public ContaCorrente(String nome, String CPF, String numeroConta, double saldo, double tarifaMensal) {
        super(nome, CPF, numeroConta, saldo);
        this.tarifaMensal = tarifaMensal;
    }
 
    @Override
    public double sacar(double quantia) {
        double saldoDisponivel = saldo - tarifaMensal;
        if (quantia <= saldoDisponivel) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente ap�s descontar a tarifa mensal!");
        }
        return saldo;
    }
}
