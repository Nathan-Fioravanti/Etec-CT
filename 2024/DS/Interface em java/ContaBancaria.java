// Definindo a interface ContaBancaria
public interface ContaBancaria {
    void depositar(double valor); 
    boolean sacar(double valor);  
    double getSaldo();           
}