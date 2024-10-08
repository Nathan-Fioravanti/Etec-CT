// Definindo a interface ContaBancaria
public interface ContaBancaria {
    void depositar(double valor); // M�todo para dep�sito
    boolean sacar(double valor);  // M�todo para saque
    double getSaldo();            // M�todo para obter o saldo
}