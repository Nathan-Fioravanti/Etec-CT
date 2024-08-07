// Classe para Trapézio
class Trapezio extends Figura {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }
}
