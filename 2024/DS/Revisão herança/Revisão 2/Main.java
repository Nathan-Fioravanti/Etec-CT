import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias de Carro e Moto
        Carro carro1 = criarCarro(scanner);
        Carro carro2 = criarCarro(scanner);
        Moto moto1 = criarMoto(scanner);
        Moto moto2 = criarMoto(scanner);

        // Calculando IPVA para cada veículo
        carro1.calculaIpva();
        carro2.calculaIpva();
        moto1.calculaIpva();
        moto2.calculaIpva();

        // Imprimindo ficha técnica de cada veículo
        System.out.println("Ficha Técnica dos Veículos:");
        carro1.imprimirFicha();
        carro2.imprimirFicha();
        moto1.imprimirFicha();
        moto2.imprimirFicha();

        scanner.close();
    }

    // Método para criar um objeto Carro com dados fornecidos pelo usuário
    private static Carro criarCarro(Scanner scanner) {
        System.out.println("Cadastro de Carro:");
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor de Tabela: ");
        double valorTabela = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Combustível (gasolina, flex ou outro): ");
        String combustivel = scanner.nextLine();

        return new Carro(modelo, valorTabela, cor, combustivel);
    }

    // Método para criar um objeto Moto com dados fornecidos pelo usuário
    private static Moto criarMoto(Scanner scanner) {
        System.out.println("Cadastro de Moto:");
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor de Tabela: ");
        double valorTabela = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Combustível (gasolina, flex ou outro): ");
        String combustivel = scanner.nextLine();

        return new Moto(modelo, valorTabela, cor, combustivel);
    }
}
