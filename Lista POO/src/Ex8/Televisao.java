package Ex8;

public class Televisao
{
    // Construtor
    public Televisao(int volume, int canal)
    {
        this.volume = volume;
        this.canal = canal;
    }


    // Propriedades
    private int volume;
    private int canal;

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public int getCanal()
    {
        return canal;
    }

    public void setCanal(int canal)
    {
        this.canal = canal;
    }
}
