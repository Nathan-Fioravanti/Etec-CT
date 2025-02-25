public class Moto extends Veiculo {
	
    // Construtor
    public Moto(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    // Sobrescrevendo o m�todo calculaIpva para motos
    @Override
    public void calculaIpva() {
        this.setIpva(this.getValorTabela() * 0.02); // 2% para motos
    }
}
