package Ex1;

public class Funcionario
{
    // Métodos
    public double calculaSalario(double vendas)
    {
        return vendas > 8000 ? 382.33 + (vendas * 0.08675) : 177.12 + (vendas * 0.0387);
    }
}