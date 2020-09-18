import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) throws ParseException {
        //data atual
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();

        //Locale.setDefault(Locale.US);
        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brasil); //data brasileira
        System.out.println("Data da sua compra "+f.format(date));

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); //formatacao da data

        System.out.println("Número: ");
        int numero = entrada.nextInt();

        //System.out.println("Data (dd/mm/yyyy): ");
        //Date data = f.parse(entrada.next());

        System.out.println("Valor: ");
        double valorTotal = entrada.nextDouble();

        System.out.println("Numero de Parcelas: ");
        int parc = entrada.nextInt();




        //fazendo a instância da classe contrato
        Contrato contrato = new Contrato(numero, date, valorTotal);

        ContradoService contService = new ContradoService(new PayPal());
        contService.processaContrato(contrato,parc);

    }
}
