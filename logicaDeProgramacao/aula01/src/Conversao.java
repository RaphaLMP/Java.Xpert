import java.util.Scanner;
import java.util.SortedMap;

public class Conversao {
    public static void main(String[] args) {
        Scanner leito = new Scanner(System.in);
        double doacaoEmDolar, valorEmReais;

        System.out.println("Doação em Dolar: $ ");
        doacaoEmDolar = leito.nextDouble();
        valorEmReais = doacaoEmDolar * 5.98;
        System.out.println("Valor recebido em Real: R$ " + valorEmReais +
                "\nObrigado pela sua doação!");

    }
}
