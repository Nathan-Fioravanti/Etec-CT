import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas figuras você deseja inserir? ");
        int n = scanner.nextInt();

        Figura[] figuras = new Figura[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escolha o tipo de figura (1-Retângulo, 2-Triângulo, 3-Quadrado, 4-Trapézio, 5-Losango): ");
            int tipo = scanner.nextInt();

            switch (tipo) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRet = scanner.nextDouble();
                    figuras[i] = new Retangulo(largura, alturaRet);
                    break;

                case 2:
                    System.out.print("Digite a base do triângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTri = scanner.nextDouble();
                    figuras[i] = new Triangulo(base, alturaTri);
                    break;

                case 3:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    figuras[i] = new Quadrado(lado);
                    break;

                case 4:
                    System.out.print("Digite a base maior do trapézio: ");
                    double baseMaior = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    double alturaTrapezio = scanner.nextDouble();
                    figuras[i] = new Trapezio(baseMaior, baseMenor, alturaTrapezio);
                    break;

                case 5:
                    System.out.print("Digite a diagonal maior do losango: ");
                    double diagonalMaior = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do losango: ");
                    double diagonalMenor = scanner.nextDouble();
                    figuras[i] = new Losango(diagonalMaior, diagonalMenor);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    i--; // Decrementa o índice para repetir a inserção da figura.
                    break;
            }
        }

        System.out.println("\nÁreas das figuras inseridas:");
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }

        scanner.close();
    }
}