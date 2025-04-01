public class SwitchInteiros {
    public static void main(String[] args) {
        int mes = 1;
        switch (mes){
            case 1:
                System.out.println("Janeiro");
                System.out.println("Férias");
                break;
            case 2:
                System.out.println("Fev");break;
            case 3:
                System.out.println("Mar");break;
            case 4:
                System.out.println("Abril");break;
            case 5:
                System.out.println("Maio");break;
            case 6:
                System.out.println("Junho");break;
            default:
                System.out.println("Segundo semestre");break;
        }
    }
}
