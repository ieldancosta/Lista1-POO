package Ex4;

public class InvoiceTeste
{
    public static void main(String[] args)
    {
        // Instâncias
        Invoice invoice1 = new Invoice(201, "Frágil", 2, 20);
        Invoice invoice2 = new Invoice(202, "Resistente", -1, 30);


        // Saída
        System.out.println("Invoice 1\nValor da fatura: " + invoice1.getInvoiceAmount());
        System.out.println("\nInvoice 2\nValor da fatura: " + invoice2.getInvoiceAmount());
    }
}
