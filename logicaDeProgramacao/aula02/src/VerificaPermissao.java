import java.util.Scanner;

public class VerificaPermissao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String perfilUsuario;
        System.out.println("Digite o perfil do seu usuário: ");
        perfilUsuario = leitor.nextLine();

        if(!(perfilUsuario.equals("administrador"))){
            System.out.println("Atenção, usuário sem privilégios administrativos" +
                    "\nAlgumas funcionalidas estarão bloqueadas");
        }
        String nome = "ELiane";
        if(nome.equalsIgnoreCase("eliane"))
            System.out.println("Bem vinda(o) "+ nome);

    }
}
