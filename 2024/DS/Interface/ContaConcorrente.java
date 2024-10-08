class ContaCorrente implements ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
 
    // Construtor que define saldo inicial e limite do cheque especial
    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        this.saldo = saldoInicial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
 
    // Implementa��o do m�todo depositar
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dep�sito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de dep�sito inv�lido.");
        }
    }
 
    // Implementa��o do m�todo sacar com cheque especial
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque falhou. Valor ultrapassa o limite do cheque especial.");
            return false;
        }
    }
 
    // Implementa��o do m�todo para obter o saldo
    @Override
    public double getSaldo() {
        return saldo;
    }
}
