public class Triangulo implements FormaGeometrica{
    private double base;
    private double altura;
    @Override
    public double calcularArea(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
    public Triangulo() {}

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
