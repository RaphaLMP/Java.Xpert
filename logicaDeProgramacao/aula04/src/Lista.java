import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Eliane");
        nomes.add(1,"Daniel");
        nomes.add("Rafaela");

        System.out.println(nomes);
        //     inicialização; condição; incremento
        for(int i = 0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        //nomes.get(1);
        //para cada nome do tipo string da coleção nomes faça
        for(String nome : nomes){
            if(nome.equalsIgnoreCase("Daniel")) {
                System.out.println(nome);
                break;
            }
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        numeros.add(45);
        numeros.add(32);
        numeros.add(17);
        numeros.add(3);
        for(Integer num: numeros){
            soma += num;
        }








    }
}
