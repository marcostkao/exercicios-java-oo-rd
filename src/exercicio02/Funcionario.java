package exercicio02;

public abstract class Funcionario {

    // TODO: implemente o código desta classe
    private String nome;
    private double salarioMensal;
    private double bonus;

    public Funcionario(String nome, double salarioMensal, double bonus) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.bonus = bonus;
    }

    public double getSalarioMensal() {
        return salarioMensal * 13;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
