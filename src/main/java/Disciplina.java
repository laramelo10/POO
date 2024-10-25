public class Disciplina extends Professor{
    private String materiaDeAtuacao;
    private int quantidadeDeAlunos;
    private int horasTrabalhadas;
    private int codigoDisciplina;
    private int quantidadeDeTurmas;


    public Disciplina(int cpf, String formacao) {
        super(cpf, formacao);
    }

    public String getMateriaDeAtuacao() {
        return materiaDeAtuacao;
    }

    public void setMateriaDeAtuacao(String materiaDeAtuacao) {
        this.materiaDeAtuacao = materiaDeAtuacao;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }


    @Override
    public double calcularRemuneracao() {
        return super.calcularRemuneracao();
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "materiaDeAtuacao='" + materiaDeAtuacao + '\'' +
                ", quantidadeDeAlunos=" + quantidadeDeAlunos +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", codigoDisciplina=" + codigoDisciplina +
                ", quantidadeDeTurmas=" + quantidadeDeTurmas +", calcular remuneração()=" + calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
