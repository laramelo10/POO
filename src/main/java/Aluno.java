public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;

    public Aluno(int cpf) {
        super(cpf);
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
    public double calcularMedia(){
        double media = (this.nota1 + this.nota2)/2;
        return media;
    }

    @Override
    public double calcularRemuneracao() {
        if(calcularMedia() >= 7)
            return 400;
        else return 0;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "[nota1=" + nota1 +
                ", nota2=" + nota2 +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
