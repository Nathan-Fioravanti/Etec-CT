class ContaPoupanca implements ContaBancaria {
    private double saldo;
    private double taxaRendimento;
 
    // Construtor 
    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        this.saldo = saldoInicial;
        this.taxaRendimento = taxaRendimento;
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
 
    // Implementa��o do m�todo sacar
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque falhou. Saldo insuficiente.");
            return false;
        }
    }
 
    // Implementa��o do m�todo para obter o saldo
    @Override
    public double getSaldo() {
        return saldo;
    }
 
    // M�todo para aplicar o rendimento mensal
    public void aplicarRendimento() {
        saldo += saldo * (taxaRendimento / 100);
        System.out.println("Rendimento de " + taxaRendimento + "% aplicado. Novo saldo: R$" + saldo);
    }
}