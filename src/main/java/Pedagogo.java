public class Pedagogo extends Pessoa{
    private int registro;

    public Pedagogo(int cpf) {
        super(cpf);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override
    public double calcularRemuneracao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Pedagogo{" +
                "registro=" + registro +", calcular remuneração()="+ calcularRemuneracao()+"]"+
                "} " + super.toString();
    }
}
