import java.util.Scanner;

public class ComandosIniciais {
    public static void main(String[] args) {
        Scanner leito = new Scanner(System.in);

        System.out.println("Bem vindos ao Shift Java!");
        System.out.println("Digite seu nome: ");

        //Variável de memória => É um espaço na memória RAm para armazenar uma informação
        //tipo nomeDaVariavel;
        int idade; //Variável do tipo inteiro
        double salário; //Variável real
        char caracter; //Variável de um caracter
        boolean temFilho; //Variável Verdadeiro ou Falso
        String nome;

        //Entrada de dados => variável = leitor.nextTipo;
        nome = leito.nextLine(); //Usar nextLine para guardar conteúdo inteiro
        System.out.println("Olá " + nome + "!");
        System.out.println("Digite sua idade: ");
        idade = leito.nextInt();
        System.out.println("Você tem " + idade + " Anos.");

        //Processamento
        //Atribuição => ? (valor | variavel | Calculo)
        int x = 10; //x recebe o valor 10, atribuindo 10 à variavel x
        int y = 10 * 2; // processamento
        y = 2 * x;

        /*
        Soma => +
        Subtração => -
        Divisão => /
        Multiplicação => *
        Resti da divisão => %
         */
        //Formas reduzidas
        int num = 10;
        num += 5;//num = num + 5;
        // += -= *= /= %=
        // i++; i += 1; i = i + 1
        //++ soma 1 na propria variavel
        //-- subtrai 1 da propria variavel
        double media = (x + y) / 2;

    }
}
