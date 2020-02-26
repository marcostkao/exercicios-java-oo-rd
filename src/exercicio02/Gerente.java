package exercicio02;

public class Gerente extends Funcionario{

    // TODO: implemente o código desta classe


    @Override
    public double getSalarioMensal() {
        return super.getSalarioMensal() * 0.8;
    }
}
