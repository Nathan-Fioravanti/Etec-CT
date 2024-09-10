
public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", "123456789", "001", 1000);
        ContaCorrente contaCorrente = new ContaCorrente("João", "987654321", "002", 1500, 15);
 
        Lucros lucros = new Lucros();
 
        
        contaPoupanca.depositar(500);
        contaPoupanca.atualizarSaldo();
        contaPoupanca.imprimirSaldo();
 
       
        contaCorrente.sacar(200);
        contaCorrente.imprimirSaldo();
 
       
        lucros.registra(contaPoupanca, 100);
        lucros.registra(contaCorrente, 200);
 
        System.out.println("Lucro total: " + lucros.getSoma());
    }
}

