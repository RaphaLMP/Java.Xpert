public class While3 {
    public static void main(String[] args) {

        //Exibir todos os pares entre 0 e 20;
        int i = 0;
        while(i <= 20){
            System.out.println(i);
            i += 2;
        }
        System.out.println("============================");
        i = 0;
        while(i <= 20){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
