import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
        //Comando de saída
        System.out.println("Aula 02 - Decisão simples");
        System.out.println("Digite sua idade: ");
        //Comando de entrada
        Scanner leitor = new Scanner(System.in);
        //Variável de memória => espaço na memória Ram para guardar uma informação
        //tipo nome;
        int idade = leitor.nextInt();
        //Desvio condicional ou comando de decisão
        //if(condição)
        if(idade >= 18) {
            System.out.println("Pode tirar a habilitação");
            System.out.println("O voto é obrigatório!");
        }
        //Processamento = cálculo e atribuições (=)
    }
}
