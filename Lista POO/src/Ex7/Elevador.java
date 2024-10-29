package Ex7;

public class Elevador
{

    // Propriedades
    private int andarAtual = 0;
    private int quantidadeAndares; /* Sem considerar o térreo */
    private double capacidadeElevador;
    private int quantidadePessoasPresentes = 0;

    public int getAndarAtual()
    {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual)
    {
        this.andarAtual = andarAtual;
    }

    public int getQuantidadeAndares()
    {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(int quantidadeAndares)
    {
        this.quantidadeAndares = quantidadeAndares;
    }

    public double getCapacidadeElevador()
    {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(double capacidadeElevador)
    {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoasPresentes()
    {
        return quantidadePessoasPresentes;
    }

    public void setQuantidadePessoasPresentes(int quantidadePessoasPresentes)
    {
        this.quantidadePessoasPresentes = quantidadePessoasPresentes;
    }


    // Métodos
    public void inicializa(double capacidadeElevador, int quantidadeAndares)
    {
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadeAndares = quantidadeAndares;
    }

    public void entra()
    {
        if (quantidadePessoasPresentes < capacidadeElevador)
        {
            quantidadePessoasPresentes++;
        }
        else
        {
            System.out.println("Não é possível adicionar mais pessoas no elevador, ele está cheio!");
        }
    }

    public void sai()
    {
        if (quantidadePessoasPresentes > 0)
        {
            quantidadePessoasPresentes--;
        }
        else
        {
            System.out.println("O elevador já está vazio!");
        }
    }

    public void sobe()
    {
        if (andarAtual < quantidadeAndares)
        {
            andarAtual++;
        }
        else
        {
            System.out.println("O elevador já está no último andar!");
        }
    }

    public void desce()
    {
        if (andarAtual > 0)
        {
            andarAtual--;
        }
        else
        {
            System.out.println("O elevador está no térreo, não é possível descer mais!");
        }
    }
}
