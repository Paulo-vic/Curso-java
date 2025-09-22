package Modulo_13.entities;

public class pessoaFisica extends Imposto {

    private double gastosSaude;

    public pessoaFisica(String nome, double renda, double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculaImposto() {
        if(getRenda() < 20000.00) {
            setImposto((getRenda() * 0.15) - (gastosSaude * 0.5));
        }
        else {
            setImposto((getRenda() * 0.25) - (gastosSaude * 0.5));
        }
        return getImposto();
    }
}
