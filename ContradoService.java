import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class ContradoService {


    private PagamentoOnline pagamentoOnline;

    public ContradoService(PagamentoOnline pagamentoOnline){

        this.pagamentoOnline = pagamentoOnline;
    }

    public void processaContrato(Contrato contrato, int meses){

        //valor de cada parcela
        double parcela = contrato.getValor_total() / meses;

        for(int i = 1; i <= meses; i++){

            double valorJuros = parcela + pagamentoOnline.juros(parcela, i);
            double valorTotal = valorJuros + pagamentoOnline.taxaDePagamento(valorJuros);

            Date data = addMounths(contrato.getData_contrato(), i);
            Locale brasil = new Locale("pt", "BR");
            DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
            System.out.println("Parcela: "+valorTotal);
            System.out.println("Vencimento: "+f2.format(data));
        }
    }

    private Date addMounths(Date data, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();

    }

}
