public class Professor extends Pessoa{
    private String formacao;
    private int quantidadeDisciplina;
    private int tempoServico;


    public Professor(int cpf, String formacao) {
        super(cpf);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQuantidadeDisciplina() {
        return quantidadeDisciplina;
    }

    public void setQuantidadeDisciplina(int quantidadeDisciplina) {
        this.quantidadeDisciplina = quantidadeDisciplina;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    @Override
    public double calcularRemuneracao() {
       if(this.tempoServico < 3)
           return 1000;
       else return 2000;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "formacao='" + formacao + '\'' +
                ", quantidadeDisciplina=" + quantidadeDisciplina +
                ", tempoServico=" + tempoServico +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
