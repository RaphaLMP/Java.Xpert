import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int placa; //5897
        System.out.println("Digite os dígitos da placa do veículo: ");
        placa = leitor.nextInt();
        int digito = placa % 10;
        switch (digito){
            case 1:
            case 2:
                System.out.println("Rodizio na segunda-feira"); break;
            case 3:
            case 4: System.out.println("Rodizio na terça-feira"); break;
            case 5:
            case 6: System.out.println("Rodizio na quarta-feira"); break;
            case 7:
            case 8: System.out.println("Rodizio na quinta-feira"); break;
            default: System.out.println("Rodizio na sexta-feira"); break;
        }
    }
}
