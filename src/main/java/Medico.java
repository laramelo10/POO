public class Medico extends Pessoa{
    private String crm;
    private int totalDePaciente;
    private String especializacao;
    private double Salario;

    public Medico(int cpf) {
        super(cpf);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getTotalDePaciente() {
        return totalDePaciente;
    }

    public void setTotalDePaciente(int totalDePaciente) {
        this.totalDePaciente = totalDePaciente;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", totalDePaciente=" + totalDePaciente +
                ", especializacao='" + especializacao + '\'' +
                ", Salario=" + Salario +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
