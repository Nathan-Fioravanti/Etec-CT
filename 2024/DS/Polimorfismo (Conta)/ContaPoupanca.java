
public class ContaPoupanca extends Conta {
    private double percentualRendimento = 0.01;
 
    public ContaPoupanca(String nome, String CPF, String numeroConta, double saldo) {
        super(nome, CPF, numeroConta, saldo);
    }
 
    public double atualizarSaldo() {
        saldo += saldo * percentualRendimento;
        return saldo;
    }
}
