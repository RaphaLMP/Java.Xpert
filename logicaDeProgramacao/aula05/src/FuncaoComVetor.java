import java.util.Scanner;

public class FuncaoComVetor {
    //1. Função que devolve o primeiro elemento do vetor
    public static double primeiroElemento(double[] vetor){
        return vetor[0];
    }
    public static void exibirVetor(double vetor[]){
        for (int i = 0; i < vetor.length;i++)
            System.out.println(vetor[i]);
    }

    //2. Função para ordenar o vetor
    public static double[] ordenaVetor(double[] vetor){
        double auxiliar;
        for(int i = 0; i < vetor.length ; i++){
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        var nome = "Eliane";
        double[] vetNum = new double[5];
        for (int i = 0; i < vetNum.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            vetNum[i] = leitor.nextInt();
        }
        System.out.println("O primeiro elemento do vetor é " + primeiroElemento(vetNum));
        vetNum = ordenaVetor(vetNum);
        exibirVetor(vetNum);
    }
}
