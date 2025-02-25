public class Carro extends Veiculo {
	
    // Construtor
    public Carro(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    // Sobrescrevendo o método calculaIpva para carros
    @Override
    public void calculaIpva() {
        this.setIpva(this.getValorTabela() * 0.04); // 4% para carros
    }
}

