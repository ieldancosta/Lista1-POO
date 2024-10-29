package Ex6;

public class AgendaTeste
{
    public static void main(String[] args)
    {
        // Instância
        Agenda agenda1 = new Agenda();


        // Saída e Testes
        agenda1.armazenaPessoa("Daniel", 18, 176);
        agenda1.armazenaPessoa("Stanley", 18, 172);
        agenda1.armazenaPessoa("André", 40, 184);

        agenda1.removePessoa("André");

        agenda1.imprimeAgenda();
        agenda1.imprimePessoa(0);

        System.out.print("\n");
        System.out.println("Posição de André: " + agenda1.buscaPessoa("André"));
        System.out.println("Posição de Stanley: " + agenda1.buscaPessoa("Stanley"));
    }
}
