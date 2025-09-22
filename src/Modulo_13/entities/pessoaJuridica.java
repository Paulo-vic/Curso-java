package Modulo_13.entities;

public class pessoaJuridica extends Imposto {
    private int funcionarios;

    public pessoaJuridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double calculaImposto() {
        if(funcionarios <= 10){
            setImposto(getRenda() * 0.16);
        }
        else {
            setImposto(getRenda() * 0.14);
        }
        return getImposto();
    }
}
