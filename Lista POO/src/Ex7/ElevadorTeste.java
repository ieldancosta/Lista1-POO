package Ex7;

public class ElevadorTeste
{
    public static void main(String[] args)
    {
        // Instância
        Elevador e1 = new Elevador();


        // Saída e Testes
        e1.inicializa(4, 8);

        System.out.println("Andar atual: " + e1.getAndarAtual());
        System.out.println("Quantidade de andares: " + e1.getQuantidadeAndares());
        System.out.println("Capacidade do elevador: " + e1.getCapacidadeElevador());
        System.out.println("Quantidade de pessoas presentes: " + e1.getQuantidadePessoasPresentes() + "\n");

        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();

        System.out.println("Andar atual: " + e1.getAndarAtual());
        System.out.println("Quantidade de andares: " + e1.getQuantidadeAndares());
        System.out.println("Capacidade do elevador: " + e1.getCapacidadeElevador());
        System.out.println("Quantidade de pessoas presentes: " + e1.getQuantidadePessoasPresentes() + "\n");

        e1.sobe();

        e1.entra();
        e1.entra();
        e1.entra();

        e1.sai();

        e1.desce();

        System.out.println("\nAndar atual: " + e1.getAndarAtual());
        System.out.println("Quantidade de andares: " + e1.getQuantidadeAndares());
        System.out.println("Capacidade do elevador: " + e1.getCapacidadeElevador());
        System.out.println("Quantidade de pessoas presentes: " + e1.getQuantidadePessoasPresentes() + "\n");
    }
}
