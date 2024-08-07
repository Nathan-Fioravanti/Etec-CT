
// Classe para Quadrado
class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}
