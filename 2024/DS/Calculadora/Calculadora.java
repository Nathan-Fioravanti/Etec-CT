
import java.util.Arrays;
 
public class Calculadora {
    private String nome;
    private double resultado;
    
    
 
    public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
 
	// Construtor
    public Calculadora(String nome) {
        this.nome = nome;
    }
 
    // M�todo para somar dois n�meros inteiros
    public int setsoma(int a, int b) {
        resultado = a + b;
        return (int) resultado;
    }
 
    // M�todo para somar dois n�meros decimais
    public double setsoma(double a, double b) {
        resultado = a + b;
        return resultado;
    }
 
 
    // M�todo para subtrair dois n�meros inteiros
    public int setsubtracao(int a, int b) {
        resultado = a - b;
        return (int) resultado;
    }
 
    // M�todo para subtrair dois n�meros decimais
    public double setsubtracao(double a, double b) {
        resultado = a - b;
        return resultado;
    }
 
    // M�todo para somar um array de n�meros
    public double setsoma(double[] numeros) {
        resultado = Arrays.stream(numeros).sum();
        return resultado;
    }
 
    // M�todo para subtrair um array de n�meros
    public double setsubtracao(double[] numeros) {
        resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
}
