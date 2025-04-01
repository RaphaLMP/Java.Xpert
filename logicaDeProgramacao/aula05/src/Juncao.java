import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juncao {
    public static void main(String[] args) {
        Scanner leitor = new  Scanner(System.in);
        List<String> nomes =
                new ArrayList<>(List.of("Ana", "Joao", "Maria"));
        for(String nome : nomes)
            System.out.println(nome);

        //3. Criar um 4 vetor que será o vetor a invertido

      /* vetA = 2,8,9,3;
        vetB = 9,5,6,7;
        vetc = 2,8,9,3,9,5,6,7;*/

        //1. Ler 2 vetores de inteiros com 4 posições
        int[] vetA = new int[4];
        int[] vetB = new int[4];
        int i;
        System.out.println("\nPreenchendo o vetor A");
        for(i=0; i<vetA.length; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetA[i] = leitor.nextInt();
        }
        System.out.println("\nPreenchendo o vetor B");
        for(i=0; i<vetB.length; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            vetB[i] = leitor.nextInt();
        }
        //2. Criar um 3 vetor que é a junção dos dois
        int[] vetC = new int[8];
        System.out.println("\nPreenchendo o vetor C");
        for(i=0; i<vetA.length; i++){
            vetC[i] = vetA[i];
            vetC[i+4] = vetB[i];
        }
        for(i=0; i<vetC.length; i++)
            System.out.println(vetC[i]);

    }
}
