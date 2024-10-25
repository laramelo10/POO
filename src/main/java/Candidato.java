public class Candidato extends Pessoa{
    private int dataDeConcurso;
    private int codigoDeVaga;
    private int pontuacao;
    public Candidato(int cpf) {
        super(cpf);
    }

    public int getDataDeConcurso() {
        return dataDeConcurso;
    }

    public void setDataDeConcurso(int dataDeConcurso) {
        this.dataDeConcurso = dataDeConcurso;
    }

    public int getCodigoDeVaga() {
        return codigoDeVaga;
    }

    public void setCodigoDeVaga(int codigoDeVaga) {
        this.codigoDeVaga = codigoDeVaga;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "dataDeConcurso=" + dataDeConcurso +
                ", codigoDeVaga=" + codigoDeVaga +
                ", pontuacao=" + pontuacao +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
