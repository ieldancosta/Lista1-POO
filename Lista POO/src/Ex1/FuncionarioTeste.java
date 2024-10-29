package Ex1;

import java.util.Scanner;

public class FuncionarioTeste
{
    public static void main(String[] args)
    {
        // Variáveis
        double vendasBruto;


        // Instâncias
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario();


        // Entrada + Validação
        do
        {
            System.out.print("Digite o valor das vendas brutas: ");
            vendasBruto = sc.nextDouble();

            if (vendasBruto < 0)
                System.out.println("Por favor, digite um valor maior ou igual a zero");
        }
        while (vendasBruto < 0);


        // Saída
        System.out.println("O seu salário líquido é: " + String.format("%.2f", f1.calculaSalario(vendasBruto)));

        sc.close();
    }
}
