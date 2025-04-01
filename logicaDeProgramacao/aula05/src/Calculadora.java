import java.io.FilterOutputStream;
import java.util.Scanner;

public class Calculadora {

    //Variáveis globais => declaradas na classe fora de qualquer função
    //Sintaxe => public static tipo nomeVariavel;
    public static double resultado;

    //Funcionalidade/responsabilidade e esse subprograma vai estar separado do main
    //Procedimento = função sem retorno
    //Sintaxe => public static void nomeFuncao(){//funcionalidade}
    public static void exibirMenu(){
        System.out.println("PROGRAMA CALCULADORA");
        System.out.println("----------------------------");
        System.out.println("Escolha sua opção: ");
        System.out.println("1 - Digitar valores");
        System.out.println("2 - Realizar soma");
        System.out.println("3 - Realizar subtração");
        System.out.println("4 - Realizar divisão");
        System.out.println("5 - Realizar multiplicação");
        System.out.println("6 - Sair");
        System.out.println(".: ");
    }

    //Função sem retorno (VOID) mas que precisa receber algo
    //public static void nomeFunção(parametros){}
    public static void exibirResultado(){
        System.out.println("Resultado = " + resultado);
    }

    public static void exibirResultadoPersonalizado(double resultado, String operacao){
        System.out.println(operacao + " = " + resultado);
    }

    public static void somar(double n1, double n2){
        System.out.println("Realizando a soma de " + n1 + " + " + n2 + "........");
        double soma = n1 + n2;
        exibirResultadoPersonalizado(soma, "Soma");
    }

    //Função => tem retorno
    //Sintaxe => public static TIPO nomeFuncao(parametros){return xx;}
    //Sintaxe => public static TIPO nomeFuncao(){return xx;}
    //Tipo: int, double, String, boolean, vetor, lista
    //SEMPRE TEM RETORNO => return x;

    public static double subtrair(double n1, double n2){
//        double subtracao = n1 -n2;
//        return subtracao;
        return n1 - n2;
    }

    public static String divisao(double n1, double n2){
        if(n2 > 0 ){
            return "Divisão = " + n1 / n2;
        }
        else {
            return "Não é possível dividir por zero.";
        }

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor1 = 0, valor2=0;
        //double resultado = 0; //variável local
        int opcao = 0;
        while (opcao!=6) {
            exibirMenu();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o 1. valor:");
                    valor1 = leitor.nextDouble();
                    System.out.println("\nDigite o 2. valor:");
                    valor2 = leitor.nextDouble();
                    System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
                    break;
                case 2:
//                    resultado = valor1 + valor2;
//                    exibirResultado(resultado);
//                    exibirResultadoPersonalizado(resultado, "Soma");
                      somar(valor1, valor2);
                    break;
                case 3:
                    double sub = subtrair(valor1,valor2);
                    System.out.println("\nRealizando a subtração entre " + valor1 + " e " + valor2);
                    exibirResultadoPersonalizado(sub, "Subtração");
                    //Outra forma de trabalhar com o retorno do método
                    exibirResultadoPersonalizado(subtrair(valor1,valor2), "Subtração");
                    //Terceira forma
                    System.out.println("Sub = " + subtrair(valor1,valor2) );

                    break;
                case 4:

                    System.out.println("\nRealizando a divisão entre " + valor1 + " e " + valor2);
                    System.out.println(divisao(valor1, valor2));


                    break;
                case 5:
                    resultado = valor1 * valor2;
                    System.out.println("\nRealizando a multiplicação entre " + valor1 + " e " + valor2);

                    break;
                case 6:
                    System.out.println("Saindo do sistema");
                    break;
            }

        }
    }

}
