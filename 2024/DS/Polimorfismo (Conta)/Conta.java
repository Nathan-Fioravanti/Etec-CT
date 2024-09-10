
public class Conta {
    protected String nome;
    protected String CPF;
    protected String numeroConta;
    protected double saldo;
 
    public Conta(String nome, String CPF, String numeroConta, double saldo) {
        this.nome = nome;
        this.CPF = CPF;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
 
    public double depositar(double quantia) {
        saldo += quantia;
        return saldo;
    }
 
    public double sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return saldo;
    }
 
    public void imprimirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
 
    public double getSaldo() {
        return saldo;
    }
}
