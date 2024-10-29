package Ex2;

public class Quadrado
{
    // Construtor
    public Quadrado(double lado)
    {
        this.lado = lado;
    }


    // Propriedades
    private double lado;

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }


    // Métodos
    public double area()
    {
        return lado * lado;
    }

    public double perimetro()
    {
        return lado * 4;
    }

}
