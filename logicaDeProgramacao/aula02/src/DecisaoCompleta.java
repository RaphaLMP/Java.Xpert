import java.util.Scanner;

public class DecisaoCompleta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        if(idade >= 18) { //resultado é verdadeiro executa o if
            System.out.println("Maior de idade");
        }else { //o resultado da condição é falso executa o else
            System.out.println("Menor de idade");
        }
    }
}
