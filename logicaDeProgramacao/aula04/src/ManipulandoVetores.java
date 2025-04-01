import java.util.Arrays;

public class ManipulandoVetores {
    public static void main(String[] args) {
        String[] alunos = {"Anderson", "William", "Roberto", "Pedro", "Matheus",
                "Gabriela", "Joao", "Rafael", "Gabriela" };
        System.out.println("Exibindo os elementos do vetor");
        for(int i = 0; i<alunos.length; i++){
            System.out.println(alunos[i]);
        }
        System.out.println("---------------------------\nOrdenando o vetor\n");
        Arrays.sort(alunos);
        for(int i = 0; i<alunos.length; i++){
            System.out.println(alunos[i]);
        }
    }
}
