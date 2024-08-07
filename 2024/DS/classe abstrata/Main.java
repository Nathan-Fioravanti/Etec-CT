import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas figuras voc� deseja inserir? ");
        int n = scanner.nextInt();

        Figura[] figuras = new Figura[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escolha o tipo de figura (1-Ret�ngulo, 2-Tri�ngulo, 3-Quadrado, 4-Trap�zio, 5-Losango): ");
            int tipo = scanner.nextInt();

            switch (tipo) {
                case 1:
                    System.out.print("Digite a largura do ret�ngulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do ret�ngulo: ");
                    double alturaRet = scanner.nextDouble();
                    figuras[i] = new Retangulo(largura, alturaRet);
                    break;

                case 2:
                    System.out.print("Digite a base do tri�ngulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do tri�ngulo: ");
                    double alturaTri = scanner.nextDouble();
                    figuras[i] = new Triangulo(base, alturaTri);
                    break;

                case 3:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    figuras[i] = new Quadrado(lado);
                    break;

                case 4:
                    System.out.print("Digite a base maior do trap�zio: ");
                    double baseMaior = scanner.nextDouble();
                    System.out.print("Digite a base menor do trap�zio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do trap�zio: ");
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
                    System.out.println("Op��o inv�lida. Tente novamente.");
                    i--; // Decrementa o �ndice para repetir a inser��o da figura.
                    break;
            }
        }

        System.out.println("\n�reas das figuras inseridas:");
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }

        scanner.close();
    }
}