package Ex3;

public class Aluno
{
    // Construtor
    public Aluno(int matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }


    // Propriedades
    private int matricula;
    private String nome;
    private double nota1, nota2, notaTrabalho;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }


    // Métodos
    public double media()
    {
        return (nota1 + nota2 + notaTrabalho) / 3;
    }

    /* Julguei que o correto seria no mínimo média 6 ao invés de 5 e que houve erro de digitação */
    public double exameFinal()
    {
        double resultadoMedia = media();
        return resultadoMedia < 6 ? 6 - resultadoMedia : 0;
    }
}
