package Ex3;

public class AlunoTeste
{
    public static void main(String[] args)
    {
        // Instância
        Aluno a1 = new Aluno(201, "Daniel", 5, 3, 4);


        // Saída
        System.out.println("Aluno a1\nMédia: " + a1.media() + "\nFinal (quantos pontos para alcançar no min média 6): " + a1.exameFinal());
    }
}
