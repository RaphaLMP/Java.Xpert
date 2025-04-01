import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int num, i = 1, tab;
        String opcao;
        do {
            i= 1;
            System.out.println("Digite o número da tabuada que deseja visualizar:");
            num = leitor.nextInt();
            System.out.println("======================================");
            System.out.println("Tabuada do " + num);
            do {
                tab = num * i;
                System.out.println(num + " x " + i + " = " + tab);
                i++;
            } while (i <= 10);
            System.out.println("======================================");
            System.out.println("Deseja ver outra tabuada? [s,n]");
            opcao = leitorTexto.next();
        }while (opcao.equalsIgnoreCase("s"));
    }
}
