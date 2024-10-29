package Ex5;

public class PrincipalEstoque
{
    public static void main(String[] args)
    {
        // Instância
        Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);


        // Saída e Testes
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        System.out.println("Estoque1\nPrecisa repor: " + estoque1.precisaRepor());
        System.out.println(estoque1.mostra());
        System.out.println("\nEstoque2\nPrecisa repor: " + estoque2.precisaRepor());
        System.out.println(estoque2.mostra());
        System.out.println("\nEstoque3\nPrecisa repor: " + estoque3.precisaRepor());
        System.out.println(estoque3.mostra());
    }
}
