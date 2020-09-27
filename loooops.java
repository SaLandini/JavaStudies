public class loooops {
    public static void main(String args[]) {
        // Do/While
        int conta = 0;

        do {
            System.out.println(conta);
            conta++;
        }while (conta < 90);

        // While

        conta = 0;

        while (conta < 90) {
            System.out.println(conta);
            conta++;
        }

        // For

        for (conta = 0; conta < 10; conta++) {
            System.out.println(conta);
        }

        // For Each
        int[] array = {1,2,4};
        for(int contador:array){
            System.out.println(contador);
        }
    }
}