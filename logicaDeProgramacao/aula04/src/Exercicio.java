import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        int[] numeros = new int[6];
        int i, soma = 0, maior, qtdPares = 0;
        //1. Preencher um vetor com 6 números
        for(i=0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros[i] = leitorNumerico.nextInt();
        }
        maior = numeros[0];
        //2. Exibir o maior elemento do vetor
        for(i=0; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é " + maior);
        //3. Somar o vetor e exibir a média
        for(i=0; i < numeros.length; i++){
            soma += numeros[i];
        }
        int media = soma / numeros.length;
        System.out.println("Média = " + media);

        //4. Exibir o índice do primeiro número negativo
        for(i=0; i < numeros.length; i++){
            if(numeros[i] < 0){
                int negativo = i;
                System.out.println("Indice o primeiro negativo é " + negativo);
                break;
            }
        }
        //5. Exibir quantos números são pares
        for(i=0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println("A quantidade de pares é " + qtdPares);
    }
}
