import java.util.Scanner;

public class Exercicio {
    /*Exercício: Você foi contratado para desenvolver um programa para uma ONG chamada
    “Solidariedade Sem Fronteiras”. A ONG tem como objetivo ajudar comunidade carente
     do bairro em que estão inseridos. O estatuto da ONG determina que todas as doações
      recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade.
    O valor do investimento deve ser de 5% da doação.
    Porém, em casos em que as doações ultrapassem R$1000,00 o investimento deve ser de 10%
 da doação. Sua missão é criar um programa capaz de fazer os cálculos necessários e
 indicar quanto deve ser investido.
    * */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double investimento;
        System.out.println("Digite o valor da doação: R$");
        double doacao = leitor.nextDouble();
        if(doacao < 1000) {
            investimento = doacao * 0.05; //doacao * 5 /100;
        //    System.out.println("Valor do investimento será de R$ " + investimento);
        }else
            investimento = doacao * 0.10;
        System.out.println("Valor do investimento será de R$ " + investimento);
    }
}
