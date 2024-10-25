public class Advogado extends Pessoa{
    private String formacao;
    private String oab;

    public Advogado(int cpf) {
        super(cpf);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "formacao='" + formacao + '\'' +
                ", oab='" + oab + '\'' +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
