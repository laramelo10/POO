public class Psicologo extends Pessoa{
    private int crp;
    private String especialidade;

    public Psicologo(int cpf) {
        super(cpf);
    }

    public int getCrp() {
        return crp;
    }

    public void setCrp(int crp) {
        this.crp = crp;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "crp=" + crp +
                ", especialidade='" + especialidade + '\'' +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
