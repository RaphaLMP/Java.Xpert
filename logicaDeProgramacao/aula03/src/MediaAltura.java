import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        double aluno1, aluno2,aluno3, aluno4, aluno5, aluno6, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do 1º aluno");
        aluno1 = leitor.nextDouble();
        System.out.println("Digite a altura do 2º aluno");
        aluno2 = leitor.nextDouble();
        System.out.println("Digite a altura do 3º aluno");
        aluno3= leitor.nextDouble();
        System.out.println("Digite a altura do 4º aluno");
        aluno4 = leitor.nextDouble();
        System.out.println("Digite a altura do 5º aluno");
        aluno5 = leitor.nextDouble();
        System.out.println("Digite a altura do 6º aluno");
        aluno6 = leitor.nextDouble();
        media = (aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6)/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();
    }
}
