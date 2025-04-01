import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double somaAlturas=0.0, media;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a altura do 1º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 2º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 3º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 4º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 5º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        System.out.println("Digite a altura do 6º aluno");
        somaAlturas = somaAlturas + leitor.nextDouble();

        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();
    }
}
