package Ex2;

public class PrincipalQuadrado
{
    public static void main(String[] args)
    {
        // Instâncias
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);


        // Saída
        System.out.println("Quadrado 1\nÁrea: " + q1.area() + "\nPerímetro: " + q1.perimetro() + "\n");
        System.out.println("Quadrado 2\nÁrea: " + q2.area() + "\nPerímetro: " + q2.perimetro() + "\n");
        System.out.println("Quadrado 3\nÁrea: " + q3.area() + "\nPerímetro: " + q3.perimetro());
    }
}
