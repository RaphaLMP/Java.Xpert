import java.util.Scanner;

public class MediaEncadeada {
    public static void main(String[] args) {
        /*Tirar a média de um aluno e exibir a situação aprovado ou reprovado
         * para ser aprovado => media >= 7 frequencia >= 75*/
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media, frequencia;
        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a frequencia do aluno: ");
        frequencia = leitor.nextDouble();
        media = (nota1 + nota2) /2;
        if(media >= 7 && frequencia >= 75){
            System.out.println("Aluno aprovado com média " + media);
        }else if(media >= 5 && frequencia >= 75){
            System.out.println("Aluno em exame");
            System.out.println("Digite a nota do exame: ");
            double notaExame = leitor.nextDouble();
            double novaMedia = (media + notaExame)/2;
            if(novaMedia >= 7)
                System.out.println("Aluno aprovado em exame");
            else
                System.out.println("Aluno reprovado após exame");
        }
        else{
            System.out.println("Aluno reprovado com média " + media);
        }
    }
}
