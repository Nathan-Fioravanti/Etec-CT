
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
 
    // Método para somar dois números inteiros
    public int setsoma(int a, int b) {
        resultado = a + b;
        return (int) resultado;
    }
 
    // Método para somar dois números decimais
    public double setsoma(double a, double b) {
        resultado = a + b;
        return resultado;
    }
 
 
    // Método para subtrair dois números inteiros
    public int setsubtracao(int a, int b) {
        resultado = a - b;
        return (int) resultado;
    }
 
    // Método para subtrair dois números decimais
    public double setsubtracao(double a, double b) {
        resultado = a - b;
        return resultado;
    }
 
    // Método para somar um array de números
    public double setsoma(double[] numeros) {
        resultado = Arrays.stream(numeros).sum();
        return resultado;
    }
 
    // Método para subtrair um array de números
    public double setsubtracao(double[] numeros) {
        resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
}
