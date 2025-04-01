public class SwitchChar {
    public static void main(String[] args) {
        char sinal = 'x';
        switch (sinal)
        {
            case '+': System.out.println("Adição"); break;
            case '*':
            case 'x':
            case 'X':
            case '.': System.out.println("multiplicação");
                break;
            case '-': System.out.println("Subtração"); break;
            case '/': System.out.println("Divisão"); break;
            default: System.out.println("Inválido"); break;
        }

    }
}
