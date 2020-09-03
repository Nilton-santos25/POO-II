public class Demointerface {
    public static void main(String[] artgs) {

        ContaCorrent cc = new ContaCorrent();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita(200);
        cp.deposita(500);

        cc.saca(100);
        cp.saca(450);

        GeradorDeExtrato extrato = new GeradorDeExtrato();
        extrato.gearaExtrato(cc);
        extrato.gearaExtrato(cp);

    }
}
