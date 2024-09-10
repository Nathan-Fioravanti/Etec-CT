
public class Lucros {
    private double soma;
 
    public void registra(Conta c, int valor) {
        soma += valor;
    }
 
    public double getSoma() {
        return soma;
    }
}
