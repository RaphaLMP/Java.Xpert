import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num, i, tab, ini, fim;
        System.out.println("Digite o número da tabuada que deseja visualizar:");
        num = leitor.nextInt();
        System.out.println("Començando de: ");
        ini = leitor.nextInt();
        System.out.println("Até: ");
        fim = leitor.nextInt();
        System.out.println("======================================");
        System.out.println("Tabuada do " + num);
        for (i = ini; i <= fim; i++){
            tab = num * i;
            System.out.println(num + " x " + i + " = " + tab);
        }
        System.out.println("==========================");
        for(i = 10; i >= 1; i--){
            tab = num * i;
            System.out.println(num + " x " + i + " = " + tab);
        }
    }
}
