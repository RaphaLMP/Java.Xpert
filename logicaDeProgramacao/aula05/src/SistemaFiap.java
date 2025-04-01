import java.util.Scanner;

public class SistemaFiap {

    //Variável global
    public static String email, senha, apelido;
    //Constante de memória
    static final int MAX = 50;
    public static String[] equipamentoSerie = new String[MAX];
    public static String[] equipamentoDescricao = new String[MAX];
    public static String[] equipamentoStatus = new String[MAX]; //Em manutenção, finalizado, entrada
    public static int qtdEquipamento = 0;

    //Método que devolva a quantidade de equipamentos que estão em manutenção
    public static int contarEquipamentoEmManutencao(){
        int total = 0;
        for(int i = 0; i < qtdEquipamento; i++){
            if(equipamentoStatus[i].equalsIgnoreCase("em manutenção"))
                total++;
        }
        return total;
    }

    //Método que altera o status
    public static void alterarStatusEquipamento(String numeroSerie, Scanner leitorNumerico){
        boolean encontrado = false;
        for(int i = 0; i < qtdEquipamento; i++){
            if(equipamentoSerie[i].equalsIgnoreCase(numeroSerie)){
                System.out.println("Deseja alterar o status atual para:" +
                        "1 - Em manutenção\t2 - Finalizado");
                int op = leitorNumerico.nextInt();
                if (op == 1)
                    equipamentoStatus[i] = "em manutenção";
                else
                    equipamentoStatus[i] = "finalizado";
                encontrado = true;
            }
        }
        if(!encontrado)
            System.out.println("Nenhum equipamento com este número de série está cadastrado");
    }
    //Método que exiba todos os equipamentos em manutenção
    public static void exibirEquipamentosEmManutencao(){
        System.out.println("Relatório de equipamentos em manutenção" +
                "\n===================================================");
        for(int i = 0; i < qtdEquipamento; i++){
            if(equipamentoStatus[i].equalsIgnoreCase("em manutenção")){
                System.out.println(equipamentoDescricao[i] + " número de série: "
                        + equipamentoSerie[i]);
            }
        }
    }

    public static void cadastrarEquipamento(Scanner leitor){
        if(qtdEquipamento >= MAX){
            System.out.println("Limite de equipamentos atingido");
            return;
        }
        System.out.println("Número de Série: ");
        equipamentoSerie[qtdEquipamento] = leitor.nextLine();
        System.out.println("Descrição: ");
        equipamentoDescricao[qtdEquipamento] = leitor.nextLine();
        System.out.println("Status: ");
        equipamentoStatus[qtdEquipamento] = leitor.nextLine();
        qtdEquipamento++;
        System.out.println("Equipamento cadastrado com sucesso!");

    }


    public static void exibirMenuPrincipal(){
        System.out.println("FIAP System");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Efetuar login");
        System.out.println("3 - Sair");
        System.out.println("Digite a opção desejada: ");
    }

    //Cadastrar usuário
    public static String cadastrarUsuario(Scanner leitor){
        String nome, telefone;
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = leitor.nextLine();
        System.out.println("Digite seu email: ");
        email = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leitor.nextLine();
        System.out.println("Como deseja ser chamado: ");
        apelido = leitor.nextLine();
        return nome + " seu cadastro foi realizado com sucesso!";
    }

    //validarLogin
    public static boolean validarLogin(String emailDigitado, String senhaDigitada){
        if(emailDigitado.equalsIgnoreCase(email) && senhaDigitada.equals(senha))
            return true;
        return false;
    }

    //subMenu
    public static void subMenu(){

        System.out.println("Digite 1 para registrar um equipamento");
        System.out.println("Digite 2 para mostrar equipamentos em manutenção");
        System.out.println("Digite 3 para exibir quantidade de equipamentos em manutenção");
        System.out.println("Digite 4 para alterar status do equipamentos");
        System.out.println("Digite 0 para voltar para o menu principal");
        System.out.println("Opção desejada .: ");
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        int opcao = 0, opcaoSubMenu;
        String emailDigitado, senhaDigitada;
        do{
            exibirMenuPrincipal();
            opcao = leitorNumerico.nextInt();
            switch (opcao){
                case 1 -> {
                    System.out.println(cadastrarUsuario(leitor));
                }//cadastrar ->
                case 2 -> {
                    System.out.println("Login");
                    System.out.println("Digite seu email: ");
                    emailDigitado = leitor.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhaDigitada = leitor.nextLine();
                    if(validarLogin(emailDigitado, senhaDigitada)){
                        System.out.println("Usuário logado com sucesso!! Bem vindo(a)!" + apelido);
                        do{
                            subMenu();
                            opcaoSubMenu = leitorNumerico.nextInt();
                            switch (opcaoSubMenu){
                                case 1 -> cadastrarEquipamento(leitor);
                                case 2 -> exibirEquipamentosEmManutencao();
                                case 3 -> System.out.println("Quantidade de equipamentos em manutenção é " + contarEquipamentoEmManutencao());
                                case 4 -> {
                                    System.out.println("Informe o número de série do equipamento: ");
                                    alterarStatusEquipamento(leitor.nextLine(), leitorNumerico);
                                }

                                case 0 -> System.out.println("Retornando ao menu principal ......");
                            }
                        }while (opcaoSubMenu != 0);


                    }else{
                        System.out.println("Usuário e/ou senha inválidos!");

                    }
                }//login
                case 3 -> System.out.println("Obrigada por utilizar nosso sistema!");
            }
        }while (opcao != 3);

    }
    /*
    Menu Principal ->


            1 -> Pedir nome, email, telefone, senha, apelido
            2 -> Pedir o email e a senha e verificar se está correto, se sim entrar no submenu, se não mandar mensagem
            usuario / senha invalidos

            SubMenu ->
            System.out.println("Usuário logado com sucesso!! Bem vindo(a)!");
        System.out.println("Digite 1 para registrar um produto");
        System.out.println("Digite 2 para mostrar produtos");
        System.out.println("Digite 3 para avaliar um produto");
        System.out.println("Digite 0 para voltar para o menu principal");
     */
}
