public class SwitchInteiros2 {
    public static void main(String[] args) {
        int mes = 1;
        switch (mes) {
            case 1 -> {
                System.out.println("Janeiro");
                System.out.println("Férias");
            }
            case 2 -> System.out.println("Fev");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            default -> System.out.println("Segundo semestre");
        }
    }
}
