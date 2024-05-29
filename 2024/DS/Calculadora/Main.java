
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = ler.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = ler.nextDouble();
 
        Calculadora calculadora = new Calculadora("Minha Calculadora");
 
        // Chamando os métodos da classe Calculadora
        double resultadoSoma = calculadora.setsoma(a, b);
        double resultadoSubtracao = calculadora.setsubtracao(a, b);
 
        System.out.println("Resultado da soma de " + a + " + " + b + " = " + resultadoSoma);
        System.out.println("Resultado da subtração de " + a + " - " + b + " = " + resultadoSubtracao);
 
        double[] numeros = {10.5, 5.3, 3};
        
        // Chamada do método de soma
        double soma = calculadora.setsoma(numeros);
        System.out.println("Soma: " + soma);
        
        // Chamada do método de subtração
        double subtracao = calculadora.setsubtracao(numeros);
        System.out.println("Subtração: " + subtracao);
    

        
        ler.close();
    }
}
