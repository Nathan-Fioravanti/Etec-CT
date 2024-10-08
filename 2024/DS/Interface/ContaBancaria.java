// Definindo a interface ContaBancaria
public interface ContaBancaria {
    void depositar(double valor); // Método para depósito
    boolean sacar(double valor);  // Método para saque
    double getSaldo();            // Método para obter o saldo
}