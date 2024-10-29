package Ex5;

public class Estoque
{
    // Construtor sem parâmetros
    public Estoque()
    {
        // Vazio
    }


    // Construtor
    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima)
    {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }


    // Propriedades
    private String nome;
    private int quantidadeAtual;
    private int quantidadeMinima;


    // Métodos
    public void mudarNome(String nome)
    {
        this.nome = nome;
    }

    public void mudarQtdMinima(int quantidadeMinima)
    {
        this.quantidadeMinima = quantidadeMinima;
    }

    public void repor(int quantidade)
    {
        this.quantidadeAtual = this.quantidadeAtual + quantidade;
    }

    public void darBaixa(int quantidade)
    {
        this.quantidadeAtual = this.quantidadeAtual - quantidade;
    }

    public String mostra()
    {
        return "Nome: " + nome + "\nQuantidade mínima: " + quantidadeMinima + "\nQuantidade atual: " + quantidadeAtual;
    }

    public boolean precisaRepor()
    {
        return quantidadeAtual <= quantidadeMinima ? true : false;
    }
}
