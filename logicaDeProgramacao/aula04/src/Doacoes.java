import java.util.Scanner;

public class Doacoes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
    /*Exercício: A ONG "Solidariedade Sem Fronteiras" está empenhada em
    coletar e processar dados para melhorar suas ações de apoio às
    comunidades carentes. Eles precisam de um programa que permita
    registrar informações sobre as doações recebidas e, em seguida,
    analisar e apresentar estatísticas sobre essas doações.
    Você foi convidado a elaborar este programa, considere os
    seguintes requisitos:
1. Solicitar ao usuário o número de doações recebidas no mês.
*/
        int qtdDoacoes = 0;
        double valorDoacao, valorTotalDoado = 0;
        System.out.println("Informe a quantidade de doações recebidas: ");
        qtdDoacoes = leitor.nextInt();
    //2. Para cada doação, solicitar ao usuário o valor doado.
        for(int i = 1; i <= qtdDoacoes; i++){
            System.out.println("Digite o valor doado na " + i + "º doação: R$");
            valorDoacao = leitor.nextDouble();
            //3. Calcular e armazenar o valor total das doações recebidas.
            valorTotalDoado += valorDoacao;
        }

    /*4. Verificar se o valor total das doações é superior a R$ 10.000,00.
     a) Se for superior, exibir a mensagem "Parabéns! O valor das doações é significativo para a ONG.".
     b) Se for igual ou inferior, exibir a mensagem "O valor das doações precisa*/
        if(valorTotalDoado > 10000)
            System.out.println("Parabéns! O valor das doações é significativo para a ONG.");
        else
            System.out.println("O valor das doações precisaser aumentado para garantir a continuidade dos projetos da ONG.");

        //5. Solicitar ao usuário o número de projetos que a ONG realizou no mês.
        System.out.println("Informe o número de projetos realizados no mês: ");
        int qtdProjetos = leitor.nextInt();

        /*6. Verificar se o número de projetos é maior ou igual a 3.
  a) Se for maior ou igual a 3, exibir a mensagem "A ONG está realizando um excelente trabalho! Parabéns a toda a equipe.".
  b) Se for inferior a 3, exibir a mensagem "É importante realizar mais projetos para impactar ainda mais vidas.".*/
        if(qtdProjetos >= 3)
            System.out.println("A ONG está realizando um excelente trabalho! Parabéns a toda a equipe.");
        else
            System.out.println("É importante realizar mais projetos para impactar ainda mais vidas.");
        //7. Calcular e armazenar a média de valor das doações recebidas por projeto (valor total das doações dividido pelo número de projetos).
        int i = 1;
        double valorDoadoPorProjeto, valorTotalDeProjeto = 0;
        while (i <= qtdProjetos){
            System.out.println("Valor doado no projeto " + i + ": ");
            valorDoadoPorProjeto = leitor.nextDouble();
            valorTotalDeProjeto += valorDoadoPorProjeto;
            i++;
        }
        double mediaDoacoesProjeto = valorTotalDeProjeto / qtdProjetos;
      //8. Exibir a média de valor das doações por projeto com duas casas decimais.
        System.out.printf("Média de doações por projeto foi de %.2f", mediaDoacoesProjeto);
        //9. Exibir a quantidade de doações recebidas.
        System.out.println("Quantidade de doações recebidas: " + qtdDoacoes);
        //10. Exibir o valor total das doações recebidas.
        System.out.println("Valor total de doações R$ " + valorTotalDoado);
       //12. Encerrar o programa exibindo uma mensagem de agradecimento e encorajamento para a continuidade do trabalho da ONG.
        System.out.println("Agradecemos sua doação");

    }
}
