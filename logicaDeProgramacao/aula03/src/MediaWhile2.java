import java.util.Scanner;

public class MediaWhile2 {
    public static void main(String[] args) {
        double somaAlturas=0.0, media;
        int contador = 1, qtdAlunos;//inicialização
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos alunos estão matriculados na turma: ");
        qtdAlunos = leitor.nextInt();
        while (contador <= qtdAlunos) { //condição => repetir enquanto a condição for verdadeira
            System.out.println("Digite a altura do " + contador + "º aluno");
            somaAlturas = somaAlturas + leitor.nextDouble();
            contador++;//incremento | contador = contador +1;
        }
        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();
    }
}
