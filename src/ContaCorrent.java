public class ContaCorrent implements Conta {

    private double saldo;
    private double taxaPorOperacao = 0.45;

    @Override
    public void deposita(double valor) {
        this.saldo += valor - this.taxaPorOperacao;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor + this.taxaPorOperacao;

    }

    @Override
    public double getSaaldo() {
        return this.saldo;
    }
}

