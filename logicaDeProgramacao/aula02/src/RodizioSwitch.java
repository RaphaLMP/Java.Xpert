import java.util.Scanner;

public class RodizioSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int placa; //5897
        System.out.println("Digite os dígitos da placa do veículo: ");
        placa = leitor.nextInt();
        int digito = placa % 10;
        switch (digito) {
            case 1,2 -> System.out.println("Segunda");
            case 3,4 -> System.out.println("Terça");
            case 5,6 -> System.out.println("Quarta");

        }
    }
}
