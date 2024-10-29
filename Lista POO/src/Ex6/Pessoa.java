package Ex6;

public class Pessoa
{
    // Construtor
    public Pessoa(String nome, int idade, double altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    // Propriedades
    private String nome;
    private int idade;
    private double altura;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }


    // Métodos
    public String mostraDados()
    {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }
}
