// Classe para Losango
class Losango extends Figura {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }
}
