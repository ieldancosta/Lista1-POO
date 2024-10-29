package Ex8;

public class TelevisaoTeste
{
    public static void main(String[] args)
    {
        // Instância
        ControleRemoto controle1 = new ControleRemoto(new Televisao(1, 0));


        // Saída e Testes
        controle1.aumentarVolume();

        System.out.println("Volume: " + controle1.volume());
        System.out.println("Canal: " + controle1.canal());

        controle1.trocarCanal(6);

        System.out.println("\nVolume: " + controle1.volume());
        System.out.println("Canal: " + controle1.canal());

        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.aumentarVolume();

        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();

        System.out.println("\nVolume: " + controle1.volume());
        System.out.println("Canal: " + controle1.canal());

        controle1.aumentarVolume();
        controle1.aumentarVolume();
        controle1.diminuirCanal();

        System.out.println("\nVolume: " + controle1.volume());
        System.out.println("Canal: " + controle1.canal());

        controle1.aumentarVolume();
    }
}
