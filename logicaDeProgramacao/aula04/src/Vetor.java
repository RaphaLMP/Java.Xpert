import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        int x;
        double[] notas = new double[5]; //notas é um vetor de 5 elementos double
        String[] nomes = {"Ana", "Andre", "Eliane", "Larissa", "Lucas", "Rafeala"};
        String[] alunos = new String[5];
                    //   0  1  2  3
        int[] idades = {10,57,45,27};
        System.out.println(idades[2]);
        int soma = idades[0] + idades[1] + idades[2] + idades[3];

        //Ler as 5 notas
        //  0     1   2   3   4
        //  10    8   9   5   4
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a " + (i+1) + "ª nota: ");
            notas[i] = leitorNumerico.nextDouble();
        }
        double somaNotas = 0;
        for(int i = 0; i < notas.length; i++){
            somaNotas +=  notas[i];
        }
        for(int i = 0; i <= 4; i++){
            System.out.println((i+1) + "ª nota: " + notas[i]);
        }
    }
}
