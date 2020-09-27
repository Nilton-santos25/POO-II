import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero: ");
        int number = entrada.nextInt();

        System.out.println("Titular: ");
        String titular = entrada.nextLine();

        System.out.println("Saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Limite de saque");
        double limite = entrada.nextDouble();

        conta conta1 = new conta(number, titular, saldo, limite);

        try{
            conta1.saque(200.0);
        }
        catch(ContaExceptions e) {
            System.out.println("Erro no saque!" + e.getMessage());
        }

    }
}
