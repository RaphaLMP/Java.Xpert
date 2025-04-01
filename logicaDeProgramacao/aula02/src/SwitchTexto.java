public class SwitchTexto {
    public static void main(String[] args) {
        String mes = "mai";
        switch (mes)
        {
            case "jan":
            case "fev":
            case "mar":
            case "abr":
            case "mai":
            case "jun": System.out.println("mes util");
                break;
            case "jul": System.out.println("ferias");
                break;
            case "ago":
            case "set":
            case "out":
            case "nov":
            case "dez": System.out.println("mes util");
                break;
            default: System.out.println("mês invalido");
                break;
        }

    }
}
