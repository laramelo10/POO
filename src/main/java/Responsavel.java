public class Responsavel  extends Pessoa{
    private String parentesco;
    private double renda;

    public Responsavel(int cpf) {
        super(cpf);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
                "parentesco='" + parentesco + '\'' +
                ", renda=" + renda +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
