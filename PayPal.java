import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class PayPal implements  PagamentoOnline { //implementando a interface

    private static final double PORCENTAGEM_TAXA = 0.02; // criação de constantes para as variaveis
    private static final double JUROS_MENSAIS = 0.01;    // criação de constantes para as variaveis

    @Override
    public double taxaDePagamento(double valor) {
        return valor * PORCENTAGEM_TAXA;
    }

    @Override
    public double juros(double valor, int meses) {
        return valor * JUROS_MENSAIS * meses;
    }



}
