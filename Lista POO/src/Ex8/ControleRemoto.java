package Ex8;

public class ControleRemoto
{
    // Construtor
    public ControleRemoto(Televisao tv)
    {
        this.tv = tv;
    }


    // Variáveis
    public Televisao tv;


    // Métodos
    public void aumentarVolume()
    {
        if (tv.getVolume() < 10)
        {
            tv.setVolume(tv.getVolume() + 1);
        }
        else
        {
            System.out.println("O volume já está no máximo");
        }
    }

    public void diminuirVolume()
    {
        if (tv.getVolume() > 0)
        {
            tv.setVolume(tv.getVolume() - 1);
        }
        else
        {
            System.out.println("O volume já está no mudo!");
        }
    }

    public void aumentarCanal()
    {
        tv.setCanal(tv.getCanal() + 1);
    }

    public void diminuirCanal()
    {
        if (tv.getCanal() > 0)
        {
            tv.setCanal(tv.getCanal() - 1);
        }
        else
        {
            System.out.println("Você já está no menor número de canal!");
        }
    }

    public void trocarCanal(int canal)
    {
        tv.setCanal(canal);
    }

    public int volume()
    {
        return tv.getVolume();
    }

    public int canal()
    {
        return tv.getCanal();
    }
}
