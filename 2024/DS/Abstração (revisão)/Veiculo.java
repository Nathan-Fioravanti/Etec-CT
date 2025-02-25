public abstract class Veiculo {
    private String modelo;
    private double valorTabela;
    private String cor;
    private String combustivel;
    private double ipva;

    // Construtor
    public Veiculo(String modelo, double valorTabela, String cor, String combustivel) {
        this.modelo = modelo;
        this.valorTabela = valorTabela;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ipva = 0.0;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getIpva() {
        return ipva;
    }
    
    public void setIpva(double ipva) {
        this.ipva = ipva;
    }

    // M�todo abstrato para calcular o IPVA
    public abstract void calculaIpva();

    // M�todo para imprimir a ficha t�cnica
    public void imprimirFicha() {
        System.out.println("FICHA T�CNICA DO VE�CULO");
        System.out.println("O modelo �: " + modelo);
        System.out.println("O valor de Tabela �: R$ " + valorTabela);
        System.out.println("A cor �: " + cor);
        System.out.println("O combust�vel �: " + combustivel);
        System.out.println("O IPVA �: R$ " + ipva);
        System.out.println("");
    }
}
