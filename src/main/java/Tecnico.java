public class Tecnico extends Pessoa{
    private String cargo;
    private String funcao;
    private int anoEntrada;

    public Tecnico(int cpf) {
        super(cpf);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "cargo='" + cargo + '\'' +
                ", funcao='" + funcao + '\'' +
                ", anoEntrada=" + anoEntrada +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
