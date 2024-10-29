package Ex6;

public class Agenda
{
    // Propriedades
    private Pessoa[] pessoas = new Pessoa[10];


    // Variáveis
    private int contadorPessoas = 0;


    // Métodos
    public void armazenaPessoa(String nome, int idade, float altura)
    {
        if (contadorPessoas < 10)
        {
            pessoas[contadorPessoas] = new Pessoa(nome, idade, altura);
            contadorPessoas++;
        }
        else
        {
            System.out.println("Não é possível adicionar mais pessoas pois sua agenda está lotada!");
        }
    }

    public void removePessoa(String nome)
    {
        for (int i = 0; i < contadorPessoas; i++)
        {
            if (pessoas[i].getNome().equals(nome))
            {
                pessoas[i] = null;
                contadorPessoas--;
            }
        }
    }

    public int buscaPessoa(String nome)
    {
        for (int i = 0; i < contadorPessoas; i++)
        {
            if (pessoas[i].getNome().equals(nome))
            {
                return i;
            }
        }

        System.out.println(nome + " não está na agenda!");
        return -1;
    }

    public void imprimeAgenda()
    {
        if (contadorPessoas == 0)
        {
            System.out.println("Agenda vazia");
        }
        else
        {
            for (int i = 0; i < contadorPessoas; i++)
            {
                System.out.println(pessoas[i].mostraDados() + "\n");
            }
        }
    }

    public void imprimePessoa(int index)
    {
        if (index >= 0 && index < contadorPessoas)
        {
            if (pessoas[index] != null)
            {
                System.out.println(pessoas[index].mostraDados());
            }
            else
            {
                System.out.println("Não foi possível encontrar uma pessoa nessa posição");
            }
        }
        else
        {
            System.out.println("Esse índice não é válido e não foi possível encontrar a pessoa");
            System.out.println("O índice deve ser entre 0 e " + (contadorPessoas - 1));
        }
    }
}
